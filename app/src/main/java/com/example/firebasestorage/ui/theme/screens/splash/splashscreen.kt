package com.example.firebasestorage.ui.theme.screens.splash


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_HOME
import com.example.firebasestorage.ui.theme.Teal200
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize()
        .paint(
            painterResource(id = R .drawable.lib6),
            contentScale = ContentScale.FillBounds
        ),
            verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
         {
        
        val mContext = LocalContext.current
        val coroutineScope = rememberCoroutineScope()
        coroutineScope.launch{
            kotlinx.coroutines.delay(3000)
        }
            navController.navigate(ROUT_HOME)



        // Lottie Animation start
        
        
        
        
        


        
        //lottie animation end
        Text(
            text = "ReadAway",
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            color = Teal200
            )
        

    }

}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}