package com.example.retrofit

data class MainState(
    val isLoading: Boolean = false,
    val characters: List<DisneyCharacter> = emptyList(),
    val customers: List<CustomersResponseItem> = emptyList()
)
