package com.example.databaseschema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.databaseschema.repository.Repository
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databaseschema.adapter.Adapter
import kotlinx.android.synthetic.main.activity_main.*


public class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private val adapter by lazy { Adapter () }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel ::class.java)
        viewModel.getPost()




        viewModel.myResponse.observe(this, Observer{response ->
            if(response.isSuccessful) {
                response.body()?.let { adapter.setData(it) }
                     val posts = response.body()
                      if (posts!=null){

                       for (i in 1 until posts.count()){
                          val tier = posts[i].tier ?:"na"
                          Log.d("tier", tier)
                          var rank = posts[i].rank ?:"na"
                          Log.d("tier", rank)}


            }}else {
                Toast.makeText(this, response.code(),Toast.LENGTH_SHORT).show()
                        Log.d("Error","Error")


                    }  }
                        )
                }

    fun setupRecyclerView(){
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        }
    }
