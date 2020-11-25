package com.crayonwriter.yarnit

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.findFragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.crayonwriter.yarnit.databinding.FragmentAddYarnDetailBinding.inflate
import com.crayonwriter.yarnit.databinding.FragmentYarnListBinding

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
            viewModel =ViewModelProvider(this).get(YarnListViewModel::class.java)




            //Add a view to the linear layout programatically



            //Connect the FAB
            binding.floatingActionButton2.setOnClickListener (
               Navigation.createNavigateOnClickListener(R.id.action_yarnListFragment_to_addYarnDetailFragment)
            )

           return binding.root
    }
}