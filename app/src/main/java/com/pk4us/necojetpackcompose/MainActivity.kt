package com.pk4us.necojetpackcompose

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.pk4us.necojetpackcompose.components.L20_bottom_nav.BottomMainScreen
import com.pk4us.necojetpackcompose.components.L21_top_app_bar.TopBarScreen
import com.pk4us.necojetpackcompose.components.L22_SnackBar.SnackBarMainScreen
import com.pk4us.necojetpackcompose.components.L23_DrawerMenu.DrawerMenuScreen
import com.pk4us.necojetpackcompose.ui.theme.MyDefaultMaterialTheme
import com.pk4us.necojetpackcompose.weather.screen.MainCard
import com.pk4us.necojetpackcompose.weather.screen.MainScreen
import com.pk4us.necojetpackcompose.weather.screen.TabLayout


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
//                        Greeting("Bali", context = this@MainActivity)

//                        val LocalWeatherContext = compositionLocalOf<Context> { error("No LocalWeatherContext provided") }
//                        val context = LocalContext.current
//                        CompositionLocalProvider(LocalWeatherContext provides context) {
//                            MainScreen(context)
//                        }

//                        BottomMainScreen()
//                        TopBarScreen(applicationContext)
//                        SnackBarMainScreen(applicationContext)
                        DrawerMenuScreen(applicationContext)
                    }
                }
            }
        }
    }
}