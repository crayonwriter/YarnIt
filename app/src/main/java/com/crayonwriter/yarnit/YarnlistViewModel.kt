package com.crayonwriter.yarnit

import android.app.Activity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.crayonwriter.yarnit.screens.AddYarnDetailFragment
import com.crayonwriter.yarnit.screens.AddYarnDetailFragmentDirections
import timber.log.Timber

class YarnlistViewModel : ViewModel() {
//private lateinit var yarnListList: MutableList<YarnDataClass>


//Create mutablelist as LiveData
    private val _yarnList = MutableLiveData<MutableList<YarnDataClass>>(mutableListOf())
    val yarnList: LiveData<MutableList<YarnDataClass>>
    get() = _yarnList

    //Create method to add a YarnDataClass object to the MutableList. This is when the Save button is pressed
    fun addYarnToList(newYarn: YarnDataClass) {
        _yarnList.value?.add(newYarn)
        //findNavController().navigate(AddYarnDetailFragmentDirections.actionAddYarnDetailFragmentToYarnlistFragment())
        Timber.i("Data SAVED!")
    }

    init {
        Timber.i("YarnListViewModel CREATED!")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("YarnListViewModel DESTROYED!!")
    }

}

    //Method that adds a view to the list

    //This function will be called when the Save button is pressed.


    //Todo: Call the method from the detail fragment that saves the added view? Not sure. Something to do with...
    //todo ... SaveButtonText.setOnClickListener
