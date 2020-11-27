package com.crayonwriter.yarnit.YarnList

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {

    //Define a MutableLiveData variable for the changed color field
    val dataFromAddYarnColor = MutableLiveData<Any>()

    //Create function to store color data to send between fragments
    fun setDataColor(color: String){
        dataFromAddYarnColor.setValue(color)
    }

    init {
        Timber.i("YarnListViewModel CREATED!")

        //addViewToList(newTextView)
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("YarnListViewModel DESTROYED!!")
    }

    //TODO: Add a method that adds a view to the list

     fun addViewToList(newTextView: View) {

    }

    //Todo: Call the method from the detail fragment that saves the added view? Not sure. Something to do with...
    //todo ... SaveButtonText.setOnClickListener
}