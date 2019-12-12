package com.example.myapplication2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel: ViewModel() {

val mName=MutableLiveData<String>()
    fun setName( s:String){
        mName.value=s
    }

    fun getName():LiveData<String> = mName
}