package com.example.koinexercise

import android.util.Log

class MainRepository {

    fun hello() {
        Log.d(this::class.java.simpleName, "Hello,World")
    }

    companion object {
        private var instance: MainRepository? = null

        fun getInstance(): MainRepository =
            instance ?: synchronized(this) {
                instance ?: MainRepository().also { instance = it }
            }
    }

}
