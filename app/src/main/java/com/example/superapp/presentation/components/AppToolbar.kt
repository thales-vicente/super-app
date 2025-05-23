package com.example.superapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superapp.R
import com.example.superapp.presentation.theme.primaryColor
import com.example.superapp.presentation.theme.whiteColor

@Composable
fun AppToolbar(){
    Row (
        modifier = Modifier
            .background(primaryColor)
            .systemBarsPadding()
            .fillMaxWidth()
            .height(70.dp)
            .padding(start = 18.dp, end = 18.dp, top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            modifier = Modifier.size(28.dp),
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = "User Image",
            tint = whiteColor
        )
        Spacer(modifier = Modifier.width(18.dp))
        TextComponent(
            modifier = Modifier.wrapContentSize(),
            textValue = stringResource(R.string.add_address),
            textColorValue = whiteColor,
            fontSizeValue = 20.sp,
            paddingValue = 8.dp
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            modifier = Modifier.size(28.dp),
            painter = painterResource(id = R.drawable.ic_notifications),
            contentDescription = "Notification Image",
            tint = whiteColor
        )
    }
}
@Preview(showBackground = true)
@Composable
fun AppToolbarPreview(){
    AppToolbar()
}