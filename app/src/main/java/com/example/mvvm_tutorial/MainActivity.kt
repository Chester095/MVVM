package com.example.mvvm_tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*
import androidx.lifecycle.Observer


class MainActivity : AppCompatActivity() {

    val ldString = MutableLiveData<String>()
    val ldInt = MutableLiveData<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ldString.value = "ldString"
        ldInt.value = 1

    }

}