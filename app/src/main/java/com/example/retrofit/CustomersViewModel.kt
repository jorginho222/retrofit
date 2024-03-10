package com.example.retrofit

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CustomersViewModel(
    private val repository: CustomerRepository = CustomerRepository(BPApi.instance)
): ViewModel() {
    var state by mutableStateOf(MainState())
        private set

    init {
        viewModelScope.launch {
            repository.getCustomers().onSuccess {
                println()
            }.onFailure {
                println()
            }
        }
    }
}