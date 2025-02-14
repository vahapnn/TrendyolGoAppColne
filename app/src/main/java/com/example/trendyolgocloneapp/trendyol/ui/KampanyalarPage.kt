package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun KampanyalarPage(){
    Text(text ="İndirimler", fontWeight = FontWeight(500))
    val imageList= listOf(
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5
    )
    LazyRow(modifier = Modifier.padding(5.dp)) {
       items(imageList.size){index->
               ImageItem2(painter = painterResource(id = imageList[index]))
       }
    }
}
@Composable
fun ImageItem2(painter: Painter) {
    Box(modifier = Modifier
        .padding(1.dp)
        .clip(RoundedCornerShape(8.dp))
        .clickable { }
    ){
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(400.dp)
                .padding(4.dp)
                .aspectRatio(1f) // Keep the image square
        )
    }
}