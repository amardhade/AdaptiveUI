package com.composeadaptiveui.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun ProvideAppUtils(
    appDimens: Dimens,
    content: @Composable () -> Unit,
) {
    val dimens = remember { appDimens }
    val typography = MaterialTheme.typography

    CompositionLocalProvider(
        LocalAppDimens provides dimens,
        LocalAppTypography provides typography
    ) {
        content()
    }
}

val LocalAppDimens = compositionLocalOf {
    CompactDimens
}

val LocalAppTypography = compositionLocalOf {
    CompactTypography
}

