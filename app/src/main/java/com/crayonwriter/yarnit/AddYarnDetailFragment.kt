package com.crayonwriter.yarnit

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.crayonwriter.yarnit.YarnList.YarnListViewModel
import com.crayonwriter.yarnit.databinding.FragmentAddYarnDetailBinding
import timber.log.Timber

class AddYarnDetailFragment : Fragment() {
    private lateinit var binding: FragmentAddYarnDetailBinding
    private lateinit var viewModel: YarnListViewModel
    private lateinit var newTextView: View
    private var color: EditText? = null
    private lateinit var brand: EditText
    private lateinit var yarnColorNameText: TextView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_yarn_detail, container, false)

        binding.YarnColorNameText.setText("Test")
        //Get a reference to the ViewModel by requesting it from the ViewModelProvider
        Timber.i("Called ViewModelProvider for the Details")
       viewModel = ViewModelProvider(this).get(YarnListViewModel::class.java)


color = view?.findViewById(R.id.YarnColorName)


        //TODO: Make the button be observable and have it call a method to update the YarnListFragment with a new layout
        binding.SaveButtonText.setOnClickListener {
            binding.YarnColorNameText.setText(color.toString())

        }




        return binding.root
    }
}