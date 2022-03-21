package com.ramiroc.week4hwkfinal.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var aValue: MutableLiveData<String> = MutableLiveData()
    var bValue: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<Int> = MutableLiveData()

    fun multiplyValues(){
        aValue.let {
            if(!it.value.equals("") && !bValue.equals("")){
                result.value = bValue.value?.let { it1 -> it.value?.toInt()?.times(it1.toInt()) }
            } else {
                result.value = 0
            }
        }
    }
}