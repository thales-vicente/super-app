package com.example.superapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.superapp.R
import com.example.superapp.presentation.theme.blackColor
import com.example.superapp.presentation.theme.primaryColor
import com.example.superapp.presentation.theme.whiteColor

@Composable
fun BannerComponent(
    title: String? = null,
    description: String? = null,
    imageUrl: String? = null,
    resourceValue : Int? = null
){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(primaryColor, blackColor)
                )
            )
    ){
        imageUrl?.let {
            AsyncImage(
                modifier = Modifier.fillMaxSize(),
                model = imageUrl,
                contentDescription = "Banner Image",
                contentScale = ContentScale.Crop
            )
        }
        resourceValue?.let {
            ImageComponent(
                modifier = Modifier
                    .size(120.dp)
                    .padding(18.dp)
                    .align(Alignment.CenterEnd),
                resourceValue = resourceValue
            )
        }
    Column (
       modifier = Modifier
           .fillMaxWidth()
           .wrapContentHeight()
           .padding(18.dp),
    ){
        title?.let {
            TextComponent(
                modifier = Modifier
                    .wrapContentSize(),
                textValue = title,
                fontSizeValue = 24.sp,
                textColorValue = whiteColor,
            )
        }
        description?.let {
            TextComponent(
                modifier = Modifier
                    .wrapContentSize(),
                textValue = description,
                textColorValue = whiteColor,
            )
        }
    }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BannerComponentPreview(){
    BannerComponent(
        title = "Hello World",
        description = "This is a preview",
        imageUrl = null,
        resourceValue = R.drawable.ic_wealth
    )
}