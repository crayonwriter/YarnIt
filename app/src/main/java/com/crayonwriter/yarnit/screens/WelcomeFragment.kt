package com.crayonwriter.yarnit.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.R
import com.crayonwriter.yarnit.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_welcome,
                container,
                false)

        //Navigation - belongs here in this UI Controller
        binding.WelcomeInstructionsButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_fragment_welcome_to_fragment_instructions))

        return binding.root
    }
}