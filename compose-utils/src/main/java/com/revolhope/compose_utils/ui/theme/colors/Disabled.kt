package com.revolhope.compose_utils.ui.theme.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Color.disableOver(alpha: Float = .4f, other: Color): Color =
    alpha(alpha = alpha).over(other = other)

@Composable
fun Color.disableOverSurface(alpha: Float = .4f): Color =
    alpha(alpha = alpha).overSurface()