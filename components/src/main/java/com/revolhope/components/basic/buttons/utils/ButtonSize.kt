package com.revolhope.components.basic.buttons.utils

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.ThemeTypographies

fun Modifier.width(size: Button.Size): Modifier =
    when (size) {
        is Button.Size.Small -> width(32.dp)
        is Button.Size.Compact -> width(34.dp)
        is Button.Size.Medium -> width(40.dp)
        is Button.Size.Large -> width(48.dp)
        else -> width(Button.Size.Medium)
    }

fun Modifier.height(size: Button.Size): Modifier =
    when (size) {
        is Button.Size.Small -> height(32.dp)
        is Button.Size.Compact -> height(34.dp)
        is Button.Size.Medium -> height(40.dp)
        is Button.Size.Large -> height(48.dp)
        else -> height(Button.Size.Medium)
    }

fun Button.Size.iconSize(): Dp =
    when (this) {
        is Button.Size.Small -> 16.dp
        is Button.Size.Compact,
        is Button.Size.Medium -> 24.dp
        is Button.Size.Large -> 24.dp
        else -> Button.Size.Medium.iconSize()
    }

@Composable
fun Button.Size.typo(): TextStyle =
    when (this) {
        is Button.Size.Small,
        is Button.Size.Compact,
        is Button.Size.Medium -> ThemeTypographies.body.M
        is Button.Size.Large -> ThemeTypographies.body.L
        else -> Button.Size.Medium.typo()
    }