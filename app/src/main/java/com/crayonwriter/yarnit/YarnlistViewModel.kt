package com.crayonwriter.yarnit

import android.view.View
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class YarnlistViewModel : ViewModel() {
private lateinit var yarnListList: MutableList<YarnDataClass>

//Create mutablelist as LiveData
    private val _yarn = MutableLiveData<MutableList<YarnDataClass>>(mutableListOf())
    val yarn: LiveData<MutableList<YarnDataClass>>
    get() = _yarn

    //Create method to add a YarnDataClass object to the MutableList
    private fun makeYarnList(newYarn: YarnDataClass) {
        _yarn.value?.add(newYarn)
    }


    fun saveNewYarnData() {

    }

    //todo There should be data here to wrap as livedata.
    //todo The data should be observed by the fragment
    //Define a MutableLiveData variable for the yarn list
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
