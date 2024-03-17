package com.example.retrofit

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NodeViewModel(
    private val repository: NodeRepository = NodeRepository(NodeApi.instance)
): ViewModel() {

    init {
        viewModelScope.launch {
            repository.getMovies().onSuccess {
                println()
            }.onFailure {
                println()
            }
        }
    }
}