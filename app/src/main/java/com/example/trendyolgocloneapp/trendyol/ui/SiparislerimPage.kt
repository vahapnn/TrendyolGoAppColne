package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.trendyolgocloneapp.R

@Composable
fun SiparislerimPAge(paddingValues: PaddingValues){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(paddingValues),
        verticalArrangement = Arrangement.Top) {
    }
    val imageList= listOf(
        R.drawable.siparis1,
        R.drawable.siparis2,
        R.drawable.siparis3,
        R.drawable.siparis4
    )
    //LazyRow(modifier = Modifier.padding(paddingValues)) {
    LazyColumn(modifier = Modifier.padding(paddingValues)) {
        items(imageList.size){index->
            ImageItem5(painter = painterResource(id = imageList[index]))
        }
    }
}
@Composable
fun ImageItem5(painter: Painter) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp), modifier = Modifier
            .padding(20.dp)
            .height(220.dp)
            .width(400.dp).clickable {  },
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.White
        ))  {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(400.dp)
                .padding(10.dp)
                .aspectRatio(1f) // Keep the image square
        )
    }
}