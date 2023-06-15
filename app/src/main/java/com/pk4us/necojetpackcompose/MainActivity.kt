package com.pk4us.necojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pk4us.necojetpackcompose.ui.theme.MyDefaultMaterialTheme
import com.pk4us.necojetpackcompose.weather.screen.Greeting

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
//                        MyL7LazyRowAndDataClass()
//                        MyL8TextExpand()
                        Greeting("Bali", context = this@MainActivity)
                    }
                }
            }
        }
    }
}