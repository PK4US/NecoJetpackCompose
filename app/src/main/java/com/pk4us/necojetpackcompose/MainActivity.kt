package com.pk4us.necojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.pk4us.necojetpackcompose.components.MyL1Text
import com.pk4us.necojetpackcompose.components.MyL2ColumnRow
import com.pk4us.necojetpackcompose.components.MyL3CardBoxImage
import com.pk4us.necojetpackcompose.components.listItem
import com.pk4us.necojetpackcompose.ui.theme.MyDefaultMaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDefaultMaterialTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    MyL1Text()
//                    MyL2ColumnRow()
                    MyL3CardBoxImage()
                }
            }
        }
    }
}