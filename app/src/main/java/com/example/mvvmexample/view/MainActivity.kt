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
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DiffUtil
import com.example.mvvmexample.R
import com.example.mvvmexample.WordsApplication
//For resource
import com.example.mvvmexample.adapters.WordListAdapter
import com.example.mvvmexample.models.Word
import com.example.mvvmexample.viewmodels.WordViewModel
import com.example.mvvmexample.viewmodels.WordViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
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
        submitButton = findViewById(R.id.button)
        val openSaveActivity = findViewById<Button>(R.id.open_save_activity)
        submitButton.setOnClickListener {
            addData(adapter)

        }
        openSaveActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SaveActivity::class.java)
            startActivityForResult(intent, newWordActivityRequestCode)
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


    @SuppressLint("NotifyDataSetChanged")
    fun addData(adapter: WordListAdapter) {
        wordViewModel.allWords.observe(this) { words ->
            val list = ArrayList<Word>()
//            words.let {


            CoroutineScope(Dispatchers.Main).launch {
                words.forEach {
                    list.add(it)
                    delay(1000)

                    adapter.submitList(list)
                    adapter.notifyDataSetChanged()
                }
            }


/*            words.forEach {
                if (list.size == 2)
                    return@observe
                CoroutineScope(Dispatchers.IO).launch {
                    delay(1000)
                    list.add(it)
                    println("javad       " + it.word + "   " + list.size)

                    CoroutineScope(Dispatchers.Main).launch {
                        delay(1000)
                        adapter.submitList(list)
                        adapter.notifyDataSetChanged()
                    }
                }
            }*/
        }
    }

    class CoursesCallback(private val oldList: List<Word>, private val newList: List<Word>) :
        DiffUtil.Callback() {

        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size


        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            TODO("Not yet implemented")
        }
    }
}
