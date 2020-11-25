package com.crayonwriter.yarnit.YarnList

import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {
    init {
        Timber.i("YarnListViewModel CREATED!")

        addViewToList()
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("YarnListViewModel DESTROYED!!")
    }

    //TODO: Add a method that adds a view to the list

     fun addViewToList() {
         
    }

    //Todo: Call the method from the detail fragment that saves the added view? Not sure. Something to do with...
    //todo ... SaveButtonText.setOnClickListener
}