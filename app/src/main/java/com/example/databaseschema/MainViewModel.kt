package com.example.databaseschema

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.databaseschema.model.Post
import com.example.databaseschema.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository):ViewModel() {

    val myResponse:MutableLiveData<Response<List<Post>>> = MutableLiveData()
    fun getPost(){
            viewModelScope.launch{
                val response: Response<List<Post>> = repository.getPost()
                myResponse.value = response
        }
    }
}