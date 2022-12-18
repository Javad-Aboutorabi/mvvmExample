package com.example.mvvmexample.models

import android.provider.Contacts
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import java.util.logging.Handler

object Repository {

    suspend fun start(newList: ArrayList<NicePlace>, lst: MutableLiveData<ArrayList<NicePlace>>) {
            for (i in 0..10) {
                delay(500)
                newList.add(NicePlace(getRandomString()))
                lst.postValue(newList)
            }
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