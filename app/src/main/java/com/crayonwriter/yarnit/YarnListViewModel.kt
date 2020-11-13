package com.crayonwriter.yarnit

import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnListViewModel : ViewModel() {
    lateinit var yarnNameList: MutableList<String>

    init {
        Timber.i("YarnListViewModel created!")
        showYarnNameList()
    }


    private fun showYarnNameList() {
        yarnNameList = mutableListOf(
                "Bernat Bulky",
                "Red Heart Soft",
                "Caron Super Soft"
        )
        yarnNameList.sort()
    }
}