package com.crayonwriter.yarnit.screens

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.R
import com.crayonwriter.yarnit.YarnDataClass
import com.crayonwriter.yarnit.YarnlistViewModel
import com.crayonwriter.yarnit.databinding.FragmentYarnlistBinding
import com.crayonwriter.yarnit.databinding.YarnItemBinding
import timber.log.Timber

class YarnlistFragment : Fragment() {
    private lateinit var binding: FragmentYarnlistBinding
    private lateinit var yarnDataClass: YarnDataClass
    private lateinit var yarnList: LiveData<MutableList<YarnDataClass>>

    //Create shared viewmodel
    private val viewModel: YarnlistViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_yarnlist, container, false)

        binding.apply {
            yarnListViewModel = viewModel
            yarnDataClass = YarnDataClass()
        }

        //Get a reference to the ViewModel by requesting it from the ViewModelProvider
        Timber.i("Called ViewModelProvider!!")
        binding.yarnListViewModel = ViewModelProvider(this).get(YarnlistViewModel::class.java)
        binding.lifecycleOwner = this

//        viewModel.yarnList.observe(viewLifecycleOwner, {
//            for (yarn in it) {
//                val yarnItemLayout = YarnItemBinding.inflate(inflater)
//                yarnItemLayout.yarnDataClass = yarn
//                binding.addNewYarnLayout.addView(yarnItemLayout.root)

        //Add a view to the linear layout programatically
        viewModel.yarnList.observe(viewLifecycleOwner, {
            for (yarn in it) {
                var layout = YarnItemBinding.inflate(inflater)
                layout.yarnDataClass = yarn
                binding.addNewYarnLayout.addView(layout.root)

            }
        })

        //Connect the FAB - Navigation, here in the UI Controller class
        binding.floatingActionButton2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_yarnlistFragment_to_addYarnDetailFragment)
        )

        //Connect menu to this fragment
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }
}
