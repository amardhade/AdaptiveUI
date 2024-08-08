package com.composeadaptiveui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composeadaptiveui.ui.theme.AppDimens
import com.composeadaptiveui.ui.theme.AppTypography
import com.composeadaptiveui.ui.theme.LocalAppDimens
import com.composeadaptiveui.ui.theme.LocalAppTypography
import com.composeadaptiveui.ui.theme.customTitle

@Composable
fun HomeScreen() {




    Text(text = "Portrait", style = AppTypography.customTitle, modifier = Modifier.padding(top = AppDimens.large))


}