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
import androidx.lifecycle.Observer
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
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_yarn_detail, container, false)

        binding.apply {
            yarnListViewModel = viewModel
        }

        viewModel.yarn.observe(viewLifecycleOwner, {
            if (isAdded()) {
                this.findNavController()
                    .navigate(R.id.action_addYarnDetailFragment_to_yarnlistFragment)
            }
        })


        return binding.root
    }
}