package com.example.mvvmexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Button
import android.widget.EditText
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
//For resource
import com.example.mvvmexample.viewmodels.MainViewModel
import com.example.mvvmexample.models.NicePlace
import com.example.mvvmexample.adapters.RecyclerAdapter
import com.example.mvvmexample.viewmodels.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private var viewManager = LinearLayoutManager(this)
    private lateinit var viewModel: MainViewModel
    private lateinit var mainrecycler: RecyclerView
    private lateinit var submitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainrecycler = findViewById(R.id.recycler)
        val application = requireNotNull(this).application
        val factory = MainViewModelFactory()
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        submitButton = findViewById(R.id.button)
        submitButton.setOnClickListener {
            addData()
        }



        initialiseAdapter()
    }

    private fun initialiseAdapter() {
        mainrecycler.layoutManager = viewManager
        viewModel.lst.observe(this, Observer {
            Log.i("data", it.toString())
            mainrecycler.adapter = RecyclerAdapter(viewModel, it, this)
        })
    }


    @SuppressLint("NotifyDataSetChanged")
    fun addData() {
        val textPlace = findViewById<EditText>(R.id.titletxt)
        viewModel.add()
        textPlace.text.clear()
//            mainrecycler.adapter?.notifyDataSetChanged()


    }
}