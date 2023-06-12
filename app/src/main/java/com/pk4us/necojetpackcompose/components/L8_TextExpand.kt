package com.pk4us.necojetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pk4us.necojetpackcompose.R

@Composable
@Preview
fun MyL8TextExpand() {
    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        itemsIndexed(
            listOf(
                L8_ItemRowModel(
                    R.drawable.image1,
                    "Миша",
                    "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
                ),
                L8_ItemRowModel(
                    R.drawable.image2,
                    "Егор",
                    "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
                ),
                L8_ItemRowModel(
                    R.drawable.image3,
                    "Андрей",
                    "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
                ),
                L8_ItemRowModel(
                    R.drawable.image4,
                    "Витя",
                    "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
                ),
                L8_ItemRowModel(
                    R.drawable.image5,
                    "Серьгей",
                    "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
                ),
                L8_ItemRowModel(
                    R.drawable.image6,
                    "Олег",
                    "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
                ),
            )
        ) { _, item -> MyRow(item = item) }
    }
}