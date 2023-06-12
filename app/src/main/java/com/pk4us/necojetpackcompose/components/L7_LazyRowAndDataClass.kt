package com.pk4us.necojetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pk4us.necojetpackcompose.R

@Composable
@Preview
fun MyL7LazyRowAndDataClass() {
    LazyRow(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        itemsIndexed(
            listOf(
                L7_ItemRowModel(R.drawable.image1, "Миша"),
                L7_ItemRowModel(R.drawable.image2, "Егор"),
                L7_ItemRowModel(R.drawable.image3, "Андрей"),
                L7_ItemRowModel(R.drawable.image4, "Витя"),
                L7_ItemRowModel(R.drawable.image5, "Серьгей"),
                L7_ItemRowModel(R.drawable.image6, "Олег"),
            )
        ) { _, item -> MyRow(item = item) }
    }
}