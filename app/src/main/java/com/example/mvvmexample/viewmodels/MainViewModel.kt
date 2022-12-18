package com.example.mvvmexample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.models.NicePlace
import com.example.mvvmexample.models.Repository
import kotlinx.coroutines.*

class MainViewModel : ViewModel() {
    var lst = MutableLiveData<ArrayList<NicePlace>>()
    var newlist = arrayListOf<NicePlace>()

    fun add() {
//        GlobalScope.launch {
//
//        }
        CoroutineScope(Dispatchers.Main).launch {
            Repository.start(newlist, lst)
        }
    }


    fun remove(blog: NicePlace) {
        Repository.remove(newlist, lst, blog)
    }

}