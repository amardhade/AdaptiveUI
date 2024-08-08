package com.composeadaptiveui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.composeadaptiveui.ui.theme.AppDimens
import com.composeadaptiveui.ui.theme.AppTypography

@Composable
fun HomeScreenLand() {

    Spacer(modifier = Modifier.size(AppDimens.small3))
    Text(text = "Landscape", fontSize = AppTypography.labelMedium.fontSize)
}