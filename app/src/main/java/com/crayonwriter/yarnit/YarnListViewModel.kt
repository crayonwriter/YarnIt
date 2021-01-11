package com.crayonwriter.yarnit

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {

    //todo There should be data here to wrap as livedata. Which I think is dataFromAddYarnColor
    //todo The data should be observed by the fragment
    //Define a MutableLiveData variable for the changed color field
    var dataFromAddYarnColor = MutableLiveData<String>()

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

    //This function will be called when the Save button is pressed.
     fun addViewToList(newTextView: View) {
//the function should be something like: MutableLiveDataObject.value = (MutableLiveDataObject.value)?.append()
    }

    //Todo: Call the method from the detail fragment that saves the added view? Not sure. Something to do with...
    //todo ... SaveButtonText.setOnClickListener
}