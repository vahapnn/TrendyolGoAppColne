package com.example.trendyolgocloneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trendyolgocloneapp.trendyol.ui.DetayPage
import com.example.trendyolgocloneapp.trendyol.ui.HomePage
import com.example.trendyolgocloneapp.trendyol.ui.HomeScreen
import com.example.trendyolgocloneapp.trendyol.ui.UstImageGallery
import com.example.trendyolgocloneapp.ui.theme.TrendYolGoCloneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrendYolGoCloneAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun SayfaGecisleri(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = "ustImageGalery"){
        composable(route = "ustImageGalery") {
              HomeScreen(modifier = Modifier)
         }
        composable(route="detay") {
            DetayPage()
        }
    }
}
@Composable
fun sayfaGecisleri(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = "home-page"){
        composable(route = "home-page") {

        }
    }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}