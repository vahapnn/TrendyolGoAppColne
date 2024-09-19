package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.navigation.NavController
import com.example.trendyolgocloneapp.R


@Composable
fun MutfaklarPage(){
    val orange = Color(0xffff6f00)
    Row (verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(220.dp)){
        Text(text ="Mutfaklar",fontWeight = FontWeight(900))
        Text(text = "Tümünü gör",color = orange, modifier = Modifier.clickable {  })
    }
    val imageList= listOf(
        R.drawable.baklava,
        R.drawable.cigkofte,
        R.drawable.doner,
        R.drawable.pide,
        R.drawable.tavuk
        ,R.drawable.pizza,
        R.drawable.baklava,
        R.drawable.hamburger,
        R.drawable.pizza,
        R.drawable.simit,
        R.drawable.sokaklezzetleri,
        R.drawable.steak,
        R.drawable.tost,
        R.drawable.yumurta,
        R.drawable.evyemekleri
    )
    LazyRow (modifier = Modifier.padding(5.dp)){
        items(imageList.size){index->
            ImageItem3(painter = painterResource(id = imageList[index]))
        }
    }
}
@Composable
fun ImageItem3(painter: Painter) {
    Box(modifier = Modifier
        .padding(8.dp)
        .clip(RoundedCornerShape(8.dp))
        .clickable { }
    ){
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .padding(4.dp)
                .aspectRatio(1f) // Keep the image square
        )
    }
}