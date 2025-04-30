package com.example.superapp.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.superapp.presentation.components.AppToolbar
import com.example.superapp.presentation.components.BannerComponent
import com.example.superapp.presentation.theme.whiteColor

@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            AppToolbar()
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier.fillMaxSize()
                .fillMaxSize()
                .wrapContentSize(Alignment.TopStart)
                .background(whiteColor)
                .padding(innerPadding)
        ) {
            BannerComponent(
                title = "Hello World",
                description = "This is a preview",
                imageUrl = ""
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}