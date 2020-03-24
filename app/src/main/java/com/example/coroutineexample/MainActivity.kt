 package com.example.coroutineexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.Factory
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
     lateinit var viewModelFactory :ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
         observeData()
    }

    fun observeData(){
        viewModel.details.observe(this, Observer {
            viewModel.setDetails()
            setText(it)
        })

    }

     fun setText(details : List<Product>){
         text.setText(details[1].body)
     }
}

