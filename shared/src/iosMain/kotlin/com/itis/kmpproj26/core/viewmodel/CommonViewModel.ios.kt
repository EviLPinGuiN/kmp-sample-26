package com.itis.kmpproj26.core.viewmodel

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

actual abstract class CommonViewModel {

    actual val viewModelScope = MainScope()

    protected actual open fun onCleared() {
    }

    fun clear() {
        onCleared()
        viewModelScope.cancel()
    }
}

// Call from swift
/*
struct ViewModelHolder <T : ViewModel> : ObservableObject  {

    let viewModel: T

    init(_ viewModel: T) {
        self.viewModel = viewModel
    }

    deinit {
        viewModel.clear()
    }
}

struct ExampleView: View {

    @StateObject let holder = ViewModelHolder(SharedViewModel())

    var body: some View {
        Text("Bound counter using Binding: \(holder.viewModel.state.name)")
    }
}
*/
