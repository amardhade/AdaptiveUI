package com.composeadaptiveui.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

val ScreenOrientation
    @Composable
    get() = LocalConfiguration.current.orientation

val AppDimens
    @Composable
    get() = LocalAppDimens.current

val AppTypography
    @Composable
    get() = LocalAppTypography.current