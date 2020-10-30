package com.example.mvvm_tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations


class MainActivity : AppCompatActivity() {

    val liveDataString = MutableLiveData<String>()
    val liveDataString2 = MutableLiveData<String>()
    val mediatorLiveData = MediatorLiveData<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        liveDataString.value = "string"
        liveDataString2.value = "string2"

        mediatorLiveData.addSource(liveDataString)  {
            test_text.text = it
        }

        mediatorLiveData.addSource(liveDataString2)  {
            test_text1.text = it
        }

        mediatorLiveData.observe(this, Observer {

        })

        button_save.setOnClickListener{
            liveDataString.value = edit_text.text.toString()
        }

        button_save2.setOnClickListener{
            liveDataString2.value = edit_text.text.toString()
        }

    }

}