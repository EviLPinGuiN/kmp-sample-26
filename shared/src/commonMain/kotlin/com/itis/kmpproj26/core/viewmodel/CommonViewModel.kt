package com.itis.kmpproj26.core.viewmodel

import kotlinx.coroutines.CoroutineScope

expect abstract class CommonViewModel() {
    val viewModelScope: CoroutineScope
    protected open fun onCleared()
}