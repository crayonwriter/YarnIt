package com.crayonwriter.yarnit.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.R
import com.crayonwriter.yarnit.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        //Navigation - belongs in this UI Controller class
        binding.loginExistingButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_welcomeFragment)
        )

        binding.addNewLoginButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_welcomeFragment)
        )
        
        return binding.root
    }

}