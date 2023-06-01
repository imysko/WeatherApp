package com.olya.weather.ui.page.town

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.olya.weather.data.db.AppDatabase

class TownViewModelFactory(
    private val db: AppDatabase
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = TownViewModel(db) as T
}