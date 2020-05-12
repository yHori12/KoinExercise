package com.example.koinexercise

object InjectionUtil {

    fun provideMainViewModelFactory(): MainViewModelFactory {
        val repository = getMainRepository()
        return MainViewModelFactory(repository)
    }

    private fun getMainRepository(): MainRepository {
        return MainRepository.getInstance()
    }
}
