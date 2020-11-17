package com.crayonwriter.yarnit

import android.os.Bundle
import android.text.style.UpdateLayout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.crayonwriter.yarnit.databinding.FragmentAddYarnDetailBinding

class AddYarnDetailFragment : Fragment() {
    private lateinit var binding: FragmentAddYarnDetailBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_yarn_detail, container, false)

//TODO: Make the button be observable and have it call a method to update the YarnListFragment with a new layout
        binding.SaveButtonText.setOnClickListener {

        }
        return binding.root
    }
}