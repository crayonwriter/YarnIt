package com.crayonwriter.yarnit.YarnList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.R
import com.crayonwriter.yarnit.databinding.FragmentYarnListBinding
import timber.log.Timber

class YarnListFragment : Fragment() {
    private lateinit var binding: FragmentYarnListBinding
    private val viewModel: YarnListViewModel by activityViewModels()
    private lateinit var addNewYarnTextView: TextView

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_yarn_list, container, false)

        //Get a reference to the ViewModel by requesting it from the ViewModelProvider
            Timber.i("Called ViewModelProvider!!")
            //viewModel = ViewModelProvider(this).get(YarnListViewModel::class.java)
            //viewModel.addViewToList(addNewYarnTextView)

        //TODO Add a view to the linear layout programatically
            //addNewYarnTextView =
            //addNewYarnTextView = getText(binding.yarnColorNameText)
            //addNewYarnTextView.textSize = 20f
            //addNewYarnTextView.text = binding.y

        //Connect the FAB - Navigation, here in the UI Controller class
            binding.floatingActionButton2.setOnClickListener (
               Navigation.createNavigateOnClickListener(R.id.action_yarnListFragment_to_addYarnDetailFragment)
            )

           return binding.root
    }
}