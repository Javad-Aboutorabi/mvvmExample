package com.example.mvvmexample.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Button
import android.widget.EditText
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmexample.R
import com.example.mvvmexample.WordsApplication
//For resource
import com.example.mvvmexample.viewmodels.MainViewModel
import com.example.mvvmexample.adapters.RecyclerAdapter
import com.example.mvvmexample.adapters.WordListAdapter
import com.example.mvvmexample.models.Word
import com.example.mvvmexample.viewmodels.WordViewModel
import com.example.mvvmexample.viewmodels.WordViewModelFactory

class MainActivity : AppCompatActivity() {
    private var viewManager = LinearLayoutManager(this)
    private lateinit var viewModel: MainViewModel
    private lateinit var mainrecycler: RecyclerView


    private lateinit var submitButton: Button
    private val newWordActivityRequestCode = 1
    private val wordViewModel: WordViewModel by viewModels {
        WordViewModelFactory((this.applicationContext as WordsApplication).repository)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val adapter = WordListAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)




//        mainrecycler = findViewById(R.id.recycler)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        submitButton = findViewById(R.id.button)
        val openSaveActivity = findViewById<Button>(R.id.open_save_activity)
        submitButton.setOnClickListener {
            addData()
        }
        openSaveActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SaveActivity::class.java)
            startActivityForResult(intent, newWordActivityRequestCode)
        }
        initialiseAdapter()



        wordViewModel.allWords.observe(this) { words ->
            // Update the cached copy of the words in the adapter.
            words.let { adapter.submitList(it) }
        }


    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

        if (requestCode == newWordActivityRequestCode && resultCode == Activity.RESULT_OK) {
            intentData?.getStringExtra(SaveActivity.EXTRA_REPLY)?.let { reply ->
                val word = Word(reply)
                wordViewModel.insert(word)
            }
        } else {
            Toast.makeText(
                applicationContext,
               "empty_not_saved",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun initialiseAdapter() {







//        mainrecycler.layoutManager = viewManager
//        viewModel.lst.observe(this, Observer {
//            Log.i("data", it.toString())
//            mainrecycler.adapter = RecyclerAdapter(viewModel, it, this)
//        })
    }


    @SuppressLint("NotifyDataSetChanged")
    fun addData() {
        val textPlace = findViewById<EditText>(R.id.titletxt)
        viewModel.add()
        textPlace.text.clear()
//            mainrecycler.adapter?.notifyDataSetChanged()


    }
}