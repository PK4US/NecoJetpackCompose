package com.pk4us.necojetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pk4us.necojetpackcompose.R

@Composable
fun MyL3CardBoxImage() {
    Column() {
        listItem(name = "Степанчук Евгений", prof = "Программист")
        listItem(name = "Степанчук Евгений", prof = "Программист")
        listItem(name = "Степанчук Евгений", prof = "Программист")
        listItem(name = "Степанчук Евгений", prof = "Программист")
        listItem(name = "Степанчук Евгений", prof = "Программист")
    }
}

@Composable
fun listItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(modifier = Modifier.background(Color.Green)) {
            Row(
                modifier = Modifier.background(Color.Red),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ava),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding()
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .background(Color.Yellow),
                ) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}
