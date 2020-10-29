package com.example.mvvm_tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import androidx.lifecycle.Observer


class MainActivity : AppCompatActivity() {

    val myLiveData = MyLiveData()
    lateinit var observer: Observer<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observer = Observer {
            test_text1.text=it
            println(it)
        }


        button_save.setOnClickListener{
            myLiveData.setValueToLifeData(edit_text.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        myLiveData.observe(this,observer)
    }

    override fun onStop() {
        super.onStop()
        myLiveData.removeObserver(observer)
    }
}