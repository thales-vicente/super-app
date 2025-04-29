package com.example.superapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

@Composable
fun AppToolbar(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(18.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = "User Image"
        )
        Spacer(modifier = Modifier.width(18.dp))
        TextComponent(
            modifier = Modifier.wrapContentSize(),
            textValue = stringResource(R.string.add_address),
            fontSizeValue = 20.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_notifications),
            contentDescription = "Notification Image"
        )
    }
}
@Preview(showBackground = true)
@Composable
fun AppToolbarPreview(){
    AppToolbar()
}