package com.example.lab7

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.lab7.ui.theme.Lab7Theme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab7Theme{
                Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
                    //MovieScreen(movies = Movie.getSampleMovies())

                    ScreenNavigation()
//                    val mainViewModel = MainViewModel()
//                    val moviesState =
//                        mainViewModel.movies.observeAsState(initial = emptyList())
//                    MovieScreen(moviesState.value)
                }
            }
        }
    }
}