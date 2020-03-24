package com.example.coroutineexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel :ViewModel(){

    val details = MutableLiveData<List<Product>>()

    fun setDetails(){
        CoroutineScope(Dispatchers.Default).launch{
            details.postValue(Repository().fetchDetails())
        }
    }
}