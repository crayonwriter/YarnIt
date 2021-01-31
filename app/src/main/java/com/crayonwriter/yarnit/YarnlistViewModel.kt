package com.crayonwriter.yarnit

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnlistViewModel : ViewModel() {

    private val _yarn = MutableLiveData<MutableList<YarnDataClass>>(mutableListOf())
    val yarn: LiveData<MutableList<YarnDataClass>>
    get() = _yarn

    private val _liveColor = MutableLiveData<String>()
    val liveColor: LiveData<String>
        get() = _liveColor

    private val _liveBrand = MutableLiveData<String>()
    val liveBrand: LiveData<String>
        get() = _liveBrand

    private val _liveWeight = MutableLiveData<String>()
    val liveWeight: LiveData<String>
        get() = _liveWeight

    private val _liveDescription = MutableLiveData<String>()
    val liveDescription: LiveData<String>
        get() = _liveDescription

    fun saveData() {

    }

    //todo There should be data here to wrap as livedata. Which I think is dataFromAddYarnColor
    //todo The data should be observed by the fragment
    //Define a MutableLiveData variable for the changed color field
    //var dataFromAddYarnColor = MutableLiveData<String>()

//    //Create function to store color data to send between fragments
//    fun setDataColor(color: String){
//        dataFromAddYarnColor.setValue(color)
//    }

    init {
        Timber.i("YarnListViewModel CREATED!")

        //addViewToList(newTextView)
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
