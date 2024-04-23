package com.example.firebasestorage.ui.theme.screens.books


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun BooksScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {

    }

}

@Preview(showBackground = true)
@Composable
fun BooksScreenPreview() {
    BooksScreen(rememberNavController())
}