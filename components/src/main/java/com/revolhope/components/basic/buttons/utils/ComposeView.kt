package com.revolhope.components.basic.buttons.utils

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

fun ComposeView.button(
    style: Button.Style,
    size: Button.Size,
    text: String,
    iconStart: Int? = null,
    iconEnd: Int? = null,
    isEnabled: Boolean = true,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    setContent {
        AppTheme {
            when (style) {
                is Button.Style.Filled -> {
                    Button.Filled(
                        text = text,
                        size = size,
                        iconStart = iconStart,
                        iconEnd = iconEnd,
                        enabled = isEnabled,
                        modifier = modifier,
                        onClick = onClick
                    )
                }
                is Button.Style.Outlined -> {
                    Button.Outlined(
                        text = text,
                        size = size,
                        iconStart = iconStart,
                        iconEnd = iconEnd,
                        enabled = isEnabled,
                        modifier = modifier,
                        onClick = onClick
                    )
                }
                is Button.Style.Flat -> {
                    Button.Flat(
                        text = text,
                        size = size,
                        iconStart = iconStart,
                        iconEnd = iconEnd,
                        enabled = isEnabled,
                        modifier = modifier,
                        onClick = onClick
                    )
                }
            }
        }
    }
}