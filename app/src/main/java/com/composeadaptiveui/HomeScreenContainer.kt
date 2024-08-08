package com.composeadaptiveui

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import com.composeadaptiveui.ui.theme.ScreenOrientation

@Composable
fun HomeScreenContainer() {
    if (ScreenOrientation == Configuration.ORIENTATION_PORTRAIT)
        HomeScreen() else HomeScreenLand()

}