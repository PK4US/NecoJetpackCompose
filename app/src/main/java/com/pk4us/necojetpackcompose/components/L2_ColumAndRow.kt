package com.pk4us.necojetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun MyL2ColumnRow() {
    Row(
        Modifier
            .background(Color.Gray)
            .fillMaxHeight(0.5f)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        Column(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth(0.3f)
                .fillMaxHeight(0.8f),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(text = "Hello")
            Text(text = "dear")
            Text(text = "friend")
        }

        Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.End,

            ) {
            Text(text = "How")
            Text(text = "are")
            Text(text = "you")
        }
    }
}