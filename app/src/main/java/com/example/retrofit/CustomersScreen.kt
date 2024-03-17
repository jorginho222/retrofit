package com.example.retrofit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CustomersScreen(viewModel: CustomersViewModel) {
    val state = viewModel.state

    if (state.customers.isNotEmpty()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(state.customers) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = it.documentNumber.toString())
                    Text(text = it.socialReason.toString())
                }
            }
        }
    }
}