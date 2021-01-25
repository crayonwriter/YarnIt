package com.crayonwriter.yarnit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.databinding.FragmentYarnListBinding
import timber.log.Timber

class YarnListFragment : Fragment() {
    private lateinit var binding: FragmentYarnListBinding
    private lateinit var viewModel: YarnListViewModel

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_yarn_list, container, false)

        //Get a reference to the ViewModel by requesting it from the ViewModelProvider
            Timber.i("Called ViewModelProvider!!")
            viewModel = ViewModelProvider(this).get(YarnListViewModel::class.java)
            //viewModel.addViewToList(addNewYarnTextView)

        //TODO Add a view to the linear layout programatically

            //addNewYarn = binding.addNewYarnTextView
            //This viewModel is observing the liveData in the ViewModel
            //viewModel.dataFromAddYarnColor.observe(viewLifecycleOwner, object: Observer<Any> {
              //  override fun onChanged(t: Any?) {
               //     addNewYarn.text = t.toString()
//            viewModel.dataFromAddYarnColor.observe(viewLifecycleOwner, Observer {newTextView ->
//                binding.addNewYarnTextView.text = newTextView.toString()
//            })


        //Connect the FAB - Navigation, here in the UI Controller class
            binding.floatingActionButton2.setOnClickListener (
               Navigation.createNavigateOnClickListener(R.id.action_yarnListFragment_to_addYarnDetailFragment)
            )

           return binding.root
    }
}