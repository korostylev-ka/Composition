package com.korostylev.composition.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.korostylev.composition.domain.entity.Level

class GameViewModelFactory(
    private val level: Level,
    private val application: Application
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        проверка что пытаемся получить именно объект GameViewModel
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(application, level) as T
        }
        throw RuntimeException("Unknown view model $modelClass")
    }
}
