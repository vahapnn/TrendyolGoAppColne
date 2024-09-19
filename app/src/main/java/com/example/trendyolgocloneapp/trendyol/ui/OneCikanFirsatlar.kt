package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trendyolgocloneapp.R


@Composable
fun OneCikanFirsatlar() {
    Text(text = "Öne çıkan fırsatlar", fontWeight = FontWeight(700))
    val imageList = listOf(
        R.drawable.pizzaone, // Replace with your image resource IDs
        R.drawable.hamburgerone,
    )

    //LazyVerticalGrid(
    //  columns = GridCells.Fixed(2), // Set the number of columns in the grid
    // modifier = Modifier.padding(2.dp)
    LazyRow(
        modifier = Modifier.padding(top = 5.dp),
        verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        items(imageList.size) { index ->
            ImageItem4(painter = painterResource(id = imageList[index]))
        }
    }
}

@Composable
fun ImageItem4(painter: Painter) {
    Box(modifier = Modifier
        .padding(8.dp)
        .clip(RoundedCornerShape(8.dp))
        .clickable { }
    ) {
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