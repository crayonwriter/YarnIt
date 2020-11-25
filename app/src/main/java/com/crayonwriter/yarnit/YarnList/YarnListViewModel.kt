package com.crayonwriter.yarnit.YarnList

import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {
    lateinit var yarnNameList: MutableList<String>

    init {
        Timber.i("YarnListViewModel CREATED!")
        //showYarnNameList()
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("YarnListViewModel DESTROYED!!")
    }

    //    private fun showYarnNameList() {
//        yarnNameList = mutableListOf(
//                "Bernat Bulky",
//                "Red Heart Soft",
//                "Caron Super Soft"
//        )
//        yarnNameList.sort()
 //   }
}