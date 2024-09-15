package com.example.trendyolgocloneapp.trendyol.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAlert
import androidx.compose.material.icons.filled.AddChart
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AddChart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trendyolgocloneapp.R

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var selectedIndex by remember {
        mutableStateOf(0)
    }
    val orange = Color(0xffff6f00)
    val imageModifier = Modifier
        .size(150.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Yellow)
    var ara by remember { mutableStateOf("") }
    var ara2 by remember {
        mutableStateOf("")
    }
    val items: List<NavItem> = listOf(
        NavItem("Anasayfa", Icons.Filled.Home, Icons.Outlined.Home),
        NavItem("Siparişlerim",Icons.Default.AddChart,Icons.Outlined.AddChart),
        NavItem("Hesabım", Icons.Filled.Person, Icons.Outlined.Person)
    )
    Scaffold(
        topBar = {
            TopAppBar(modifier = modifier,
                colors = topAppBarColors(
                    containerColor = orange,
                    titleContentColor = Color.White,
                ),
                title = {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.trendyolgo),
                                contentDescription = "Image",
                                tint = Color.Unspecified,
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp)
                                    .padding(7.dp)
                                    .navigationBarsPadding()
                            )
                            OutlinedTextField(value = ara, onValueChange = { ara = it },
                                placeholder = { Text(text = "Ara") },
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(240.dp),
                                shape = RoundedCornerShape(30.dp),
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = ""
                                    )
                                }
                            )
                            Icon(
                                imageVector = Icons.Default.AddAlert, contentDescription = "",
                                modifier = Modifier.padding(20.dp)
                            )
                        }

                }
            )
        },
        content = {
            when (selectedIndex) {
                0 -> HomePage(paddingValues = it)
                1-> SiparislerimPAge(paddingValues = it)
                2 -> ProfilePage(padding = it)
            }
        },
        bottomBar = {
            NavigationBar(containerColor = Color.White) {
                items.forEachIndexed { index, navItem ->
                    NavigationBarItem(selected = selectedIndex == index, onClick = {
                        selectedIndex = index
                    }, icon = {
                        if (selectedIndex == index) {
                            Icon(imageVector = navItem.selectedIcon, contentDescription = "",
                                tint = orange)
                        } else {
                            Icon(imageVector = navItem.unSelectedIcon, contentDescription = "")
                        }
                    },
                        label = { Text(text = navItem.title) },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = orange,
                            selectedTextColor = orange
                        )
                        )
                }
            }
        },
    ) 
}