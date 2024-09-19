package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAlert
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.AddTask
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Dialpad
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePage(padding:PaddingValues){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(padding),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Person, contentDescription = "")
            Text(text = "Kullanıcı bilgilerim", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddCard, contentDescription = "")
            Text(text = "Kayıtlı kartlarım", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Password, contentDescription = "")
            Text(text = "Şifre değişikliği", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Email, contentDescription = "")
            Text(text = "E-posta değişikliği", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddAlert, contentDescription = "")
            Text(text = "Duyuru tercihleri", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddTask, contentDescription = "")
            Text(text = "Trendyol Go Seni Dinliyor", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Dialpad, contentDescription = "")
            Text(text = "Daha fazla", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Cancel, contentDescription = "")
            Text(text = "Çıkış yap", modifier = Modifier
                .padding(10.dp)
                .clickable { },
                fontWeight = FontWeight(700))
        }
    }
}