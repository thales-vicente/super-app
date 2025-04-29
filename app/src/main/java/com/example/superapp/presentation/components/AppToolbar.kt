package com.example.superapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superapp.R

@Composable
fun AppToolbar(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(18.dp)
    ){
        Icon(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = "User Image"
        )

    }
}
@Preview(showBackground = true)
@Composable
fun AppToolbarPreview(){
    AppToolbar()
}