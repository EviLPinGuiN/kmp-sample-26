package com.itis.kmpproj26.feature

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.itis.kmpproj26.feature.weather.ui.WeatherViewModel

// без коина, базовый синтаксис
val weatherViewModelFactory = viewModelFactory {
    initializer {
        WeatherViewModel()
    }
}
