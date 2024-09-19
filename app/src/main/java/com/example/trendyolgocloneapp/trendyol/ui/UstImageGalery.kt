package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trendyolgocloneapp.R

@Composable
fun UstImageGallery(navController: NavController) {
    val imageList = listOf(
        R.drawable.image1, // Replace with your image resource IDs
        R.drawable.image2,
    )
    LazyRow(
        modifier = Modifier.padding(top = 5.dp),
        verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        items(imageList.size) { index ->
            ImageItem(painter = painterResource(id = imageList[index]),navController)
        }
    }
}

@Composable
fun ImageItem(painter: Painter,navController: NavController ) {
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
                .aspectRatio(1f)
                .clickable { navController.navigate("detay") } // Keep the image square
        )
    }
}