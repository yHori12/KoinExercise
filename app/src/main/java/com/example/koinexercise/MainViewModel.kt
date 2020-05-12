package com.example.koinexercise

import androidx.lifecycle.ViewModel

class MainViewModel(private val repository: MainRepository) :ViewModel(){

    fun call(){
        repository.hello()
    }
}
