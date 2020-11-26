package com.crayonwriter.yarnit.YarnList

import android.view.View
import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {
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