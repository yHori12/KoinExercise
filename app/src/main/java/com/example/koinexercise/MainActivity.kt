package com.example.koinexercise

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private val viewModelKoin by viewModel<MainViewModel>()
    private val viewModelUtil by viewModels<MainViewModel> {
        InjectionUtil.provideMainViewModelFactory()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelKoin.call()
        viewModelUtil.call()
    }
}
