package com.example.mvvm_tutorial

import androidx.lifecycle.LiveData

class MyLiveData:LiveData<String>(){

    fun setValueToLifeData(string:String){
        value = string
     }

    override fun onActive() {
        super.onActive()
        println("Active")
    }

    override fun onInactive() {
        super.onInactive()
        println("Inactive")
    }
}