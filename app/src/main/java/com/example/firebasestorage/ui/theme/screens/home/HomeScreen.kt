package com.example.firebasestorage.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.Teal200

@Composable
fun HomeScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(
                text = "Home",
                fontWeight = FontWeight.Bold
            )
            },
            backgroundColor = Teal200
        )
        //Start of Box **(to write words on top of aan image)**
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription =" Car",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds)
            Text(
                text = "Let's plan your next vacation",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                textAlign = TextAlign.Center)

        }
//End of Box*****


    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}