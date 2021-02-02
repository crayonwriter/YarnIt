package com.crayonwriter.yarnit.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.R
import com.crayonwriter.yarnit.YarnDataClass
import com.crayonwriter.yarnit.YarnItem
import com.crayonwriter.yarnit.YarnlistViewModel
import com.crayonwriter.yarnit.databinding.FragmentYarnlistBinding
import com.crayonwriter.yarnit.databinding.YarnItemBinding
import timber.log.Timber

class YarnlistFragment : Fragment() {
    private lateinit var binding: FragmentYarnlistBinding

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

        }
        //Get a reference to the ViewModel by requesting it from the ViewModelProvider
        Timber.i("Called ViewModelProvider!!")
        binding.yarnListViewModel = ViewModelProvider(this).get(YarnlistViewModel::class.java)

        //Add a view to the linear layout programatically
        val yarnItemLayout = YarnItemBinding.inflate(inflater)
        yarnItemLayout.yarnDataClass = YarnDataClass()
        binding.addNewYarnLayout.addView(yarnItemLayout.root)

        binding.lifecycleOwner = this

//            var addNewYarn: View = binding.addNewYarnTextView


        //This viewModel is observing the liveData in the ViewModel
        //viewModel.dataFromAddYarnColor.observe(viewLifecycleOwner, object: Observer<Any> {
        //  override fun onChanged(t: Any?) {
        //     addNewYarn.text = t.toString()
//            viewModel.dataFromAddYarnColor.observe(viewLifecycleOwner, Observer {newTextView ->
//                binding.addNewYarnTextView.text = newTextView.toString()
//            })


        //Connect the FAB - Navigation, here in the UI Controller class
        binding.floatingActionButton2.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_yarnListFragment_to_addYarnDetailFragment)
        )

        return binding.root
    }

//    private fun addNewYarnLayout(yarnItem: YarnItem) {
//        val newYarnItem = LinearLayout(context)
//        }
//
//        val newYarnLayout: LinearLayout = binding.addNewYarnLayout
//        //newYarnLayout.addView(newYarnItem)
    }
