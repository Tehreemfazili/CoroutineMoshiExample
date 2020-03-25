package com.example.coroutineexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val details = MutableLiveData<List<Product>>()

    fun setDetails() {
        viewModelScope.launch {
            details.postValue(Repository().fetchDetails())
        }
    }
}