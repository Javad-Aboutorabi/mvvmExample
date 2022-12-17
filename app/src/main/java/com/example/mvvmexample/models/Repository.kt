package com.example.mvvmexample.models

import android.provider.Contacts
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import java.util.logging.Handler

object Repository {
    fun start(newList: ArrayList<NicePlace>, lst: MutableLiveData<ArrayList<NicePlace>>) {



//        lifecycleScope.launch {
//            myTextView.text = "Starting"
//            delay(1000L)
//            myTextView.text = "Processing"
//            delay(2000L)
//            myTextView.text = "Done"
//        }

        newList.add(NicePlace(getRandomString()))
        lst.value = newList
    }

    fun remove(newList: ArrayList<NicePlace>, lst: MutableLiveData<ArrayList<NicePlace>>,blog:NicePlace) {
        newList.remove(blog)
        lst.value = newList
    }

    private fun getRandomString(): String {
        val allowedChars = ('A'..'Z') + ('a'..'z')
        return (1..6)
            .map { allowedChars.random() }
            .joinToString("")
    }
}