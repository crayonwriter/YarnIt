package com.crayonwriter.yarnit.YarnList

import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {
    init {
        Timber.i("YarnListViewModel CREATED!")
        //showYarnNameList()
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("YarnListViewModel DESTROYED!!")
    }
}