package com.example.trendyolgocloneapp.trendyol.ui

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trendyolgocloneapp.R

@Composable
fun PuanPage(){
    val orange = Color(0xffff6f00)
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp), modifier = Modifier
            .padding(5.dp)
            .height(220.dp)
            .width(400.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.White
        )) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(orange)) {
            Row (modifier = Modifier
                .padding(7.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
              Row(horizontalArrangement = Arrangement.spacedBy(5.dp),
                  verticalAlignment = Alignment.CenterVertically) {
                  Icon(painter = painterResource(id =R.drawable.goplus )  , contentDescription = "",tint = Color.Unspecified)
                  Text(text = "yeni", textAlign = TextAlign.Center, fontSize = 15.sp, fontWeight = FontWeight.Bold,
                      modifier = Modifier
                          .height(20.dp)
                          .width(50.dp)
                          .clip(shape = RoundedCornerShape(10.dp))
                          .background(Color.White), color = Color.Red)
              }
                Text(text = "Detayları gör>", fontSize = 15.sp,
                    modifier = Modifier.clickable {  })
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(Color.White)) {
            Row (modifier = Modifier
                .padding(7.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Row(horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id =R.drawable.star )  , contentDescription = "",tint = Color.Unspecified)
                    Text(text = "Puanın=0", textAlign = TextAlign.Center,
                        fontSize = 15.sp, fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .background(Color.White), color = Color.Black)
                }
                Text(text = "Nasıl puan kazanabilirim?", fontSize = 13.sp, color = orange,
                    modifier = Modifier.clickable {  })
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color.White)) {
            Row {
                Row (modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly){
                    Column(verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "100", textAlign = TextAlign.Center,
                            fontSize = 15.sp, fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .background(Color.White), color = Color.Black)
                        Icon(painter = painterResource(id =R.drawable.gift )  , contentDescription = "",tint = Color.Unspecified)
                        Text(text = "1. Yedikçe İndirim Kuponu(50)", color = Color.Black, fontSize = 10.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly){
                    Column(verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "200", textAlign = TextAlign.Center,
                            fontSize = 15.sp, fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .background(Color.White), color = Color.Black)
                        Icon(painter = painterResource(id =R.drawable.gift )  , contentDescription = "",tint = Color.Unspecified)
                        Text(text = "2. Yedikçe İndirim Kuponu(50)", color = Color.Black, fontSize = 10.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly){
                    Column(verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "300", textAlign = TextAlign.Center,
                            fontSize = 15.sp, fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .background(Color.White), color = Color.Black)
                        Icon(painter = painterResource(id =R.drawable.gift )  , contentDescription = "",tint = Color.Unspecified)
                        Text(text = "3. Yedikçe İndirim Kuponu(50)", color = Color.Black, fontSize = 10.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly){
                    Column(verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "600", textAlign = TextAlign.Center,
                            fontSize = 15.sp, fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .background(Color.White), color = Color.Black)
                        Icon(painter = painterResource(id =R.drawable.gift )  , contentDescription = "",tint = Color.Unspecified)
                        Text(text = "4. Yedikçe İndirim Kuponu(50)", color = Color.Black, fontSize = 10.sp)
                    }
                }
            }
        }

    }
}