package com.example.retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    val viewModel by viewModels<CustomersViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MainScreen()
            CustomersScreen(viewModel = viewModel)
//            NodeScreen(viewModel = viewModel)
//            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        val names = (0..200).map {
            "$it - Armando"
        }

        LazyColumn() {
            items(names) { name ->
                Text(text = name)
            }
        }
    }

//    @Preview(showBackground = true)
//    @Composable
//    fun Preview() {
//        MainScreen()
//    }
}

