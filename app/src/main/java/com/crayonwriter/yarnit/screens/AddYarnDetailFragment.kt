package com.crayonwriter.yarnit.screens

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.crayonwriter.yarnit.R
import com.crayonwriter.yarnit.YarnlistViewModel
import com.crayonwriter.yarnit.databinding.FragmentAddYarnDetailBinding

class AddYarnDetailFragment : Fragment() {
    private lateinit var binding: FragmentAddYarnDetailBinding
    //Create shared viewmodel
    private val viewModel: YarnlistViewModel by activityViewModels()
    private lateinit var layout: Layout

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_yarn_detail, container, false)

        //binding.YarnColorNameText.setText("Test")

        //Get a reference to the ViewModel by requesting it from the ViewModelProvider
        viewModel = ViewModelProvider(this).get(YarnlistViewModel::class.java)
      // viewModel.dataFromAddYarnColor.observe(LifecycleOwner {  })

        //TODO: Make the button be observable and have it call a method to update the YarnListFragment with a new textview
        binding.SaveButtonText.setOnClickListener {
            this.findNavController().navigate(R.id.action_addYarnDetailFragment_to_yarnListFragment)
//            viewModel.


//            binding.YarnColorNameText.setText(color?.text.toString())


        }

        return binding.root
    }
}