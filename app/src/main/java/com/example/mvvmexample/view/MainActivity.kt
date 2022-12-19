package com.example.mvvmexample.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Button
import android.widget.EditText
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmexample.R
//For resource
import com.example.mvvmexample.viewmodels.MainViewModel
import com.example.mvvmexample.adapters.RecyclerAdapter
import com.example.mvvmexample.viewmodels.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private var viewManager = LinearLayoutManager(this)
    private lateinit var viewModel: MainViewModel
    private lateinit var mainrecycler: RecyclerView
    private lateinit var submitButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainrecycler = findViewById(R.id.recycler)
        val application = requireNotNull(this).application
        val factory = MainViewModelFactory()
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        submitButton = findViewById(R.id.button)
        val openSaveActivity = findViewById<Button>(R.id.open_save_activity)
        submitButton.setOnClickListener {
            addData()
        }
        openSaveActivity.setOnClickListener { startActivity(Intent(this,SaveActivity::class.java)) }



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