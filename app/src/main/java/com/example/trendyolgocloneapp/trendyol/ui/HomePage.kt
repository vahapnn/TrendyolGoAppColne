package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.trendyolgocloneapp.R


@Composable
fun HomePage(paddingValues: PaddingValues){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally) {
        UstImageGallery()
        KampanyalarPage()
    }
}

@Composable
fun UstImageGallery(){
    val imageList = listOf(
        R.drawable.image1, // Replace with your image resource IDs
        R.drawable.image2,
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Set the number of columns in the grid
        modifier = Modifier.padding(4.dp)
    ) {
        items(imageList.size) { index ->
            ImageItem(painter = painterResource(id = imageList[index]))
        }
    }
}
@Composable
fun ImageItem(painter: Painter) {
    Box(modifier = Modifier.padding(8.dp)
        .clip(RoundedCornerShape(8.dp))
        .clickable {  }
    ){
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(4.dp)
                .aspectRatio(1f) // Keep the image square
        )
    }
}