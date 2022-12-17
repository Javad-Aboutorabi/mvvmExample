package com.example.mvvmexample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.models.NicePlace
import com.example.mvvmexample.models.Repository

class MainViewModel : ViewModel() {
    var lst = MutableLiveData<ArrayList<NicePlace>>()
    var newlist = arrayListOf<NicePlace>()

    fun add() {
//        for (i in 1..9) {
//            Thread(Runnable {
                Repository.start(newlist, lst)
//                Thread.sleep(1000)
//            })

//        }
    }


    fun remove(blog: NicePlace) {
        Repository.remove(newlist, lst, blog)
    }

}