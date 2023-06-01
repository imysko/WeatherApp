package com.olya.weather.ui.page.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.olya.weather.data.db.AppDatabase

class MainViewModelFactory(
    private val db: AppDatabase
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = MainViewModel(db) as T
}