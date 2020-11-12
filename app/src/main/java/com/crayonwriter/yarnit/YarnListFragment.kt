package com.crayonwriter.yarnit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.databinding.FragmentYarnListBinding

class YarnListFragment : Fragment() {
    private lateinit var binding: FragmentYarnListBinding
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_yarn_list, container, false)

            binding.floatingActionButton2.setOnClickListener(
                    Navigation.createNavigateOnClickListener(R.id.action_yarnListFragment_to_addYarnDetailFragment)
            )

            return binding.root
    }
}