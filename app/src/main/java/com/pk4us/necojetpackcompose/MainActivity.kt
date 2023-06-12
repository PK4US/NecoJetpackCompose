package com.pk4us.necojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.pk4us.necojetpackcompose.components.MyL1Text
import com.pk4us.necojetpackcompose.components.MyL2ColumnRow
import com.pk4us.necojetpackcompose.components.MyL3CardBoxImage
import com.pk4us.necojetpackcompose.components.MyL4Modifier
import com.pk4us.necojetpackcompose.components.MyL5State
import com.pk4us.necojetpackcompose.components.MyL6LazyColumn
import com.pk4us.necojetpackcompose.components.MyL7LazyRowAndDataClass
import com.pk4us.necojetpackcompose.components.listItem
import com.pk4us.necojetpackcompose.ui.theme.MyDefaultMaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDefaultMaterialTheme() {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//                        MyL1Text()
//                        MyL2ColumnRow()
//                        MyL3CardBoxImage()
//                        MyL4Modifier()
//                        MyL5State()
//                        MyL6LazyColumn()
                        MyL7LazyRowAndDataClass()
                    }
                }
            }
        }
    }
}