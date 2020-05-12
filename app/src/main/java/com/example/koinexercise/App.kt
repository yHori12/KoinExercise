package com.example.koinexercise

import android.app.Application
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(listOf(module))
        }
    }

    private val module: Module = module {
        viewModel { MainViewModel(get()) }
        single { MainRepository() }
    }

}
