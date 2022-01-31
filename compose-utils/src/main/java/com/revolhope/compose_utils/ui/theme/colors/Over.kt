package com.revolhope.compose_utils.ui.theme.colors

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

@Composable
fun Color.over(other: Color): Color =
    compositeOver(other)

@Composable
fun Color.overPrimary(): Color =
    over(MaterialTheme.colorScheme.primary)

@Composable
fun Color.overPrimaryContainer(): Color =
    over(MaterialTheme.colorScheme.primaryContainer)

@Composable
fun Color.overSecondary(): Color =
    over(MaterialTheme.colorScheme.secondary)

@Composable
fun Color.overSecondaryContainer(): Color =
    over(MaterialTheme.colorScheme.secondaryContainer)

@Composable
fun Color.overTertiary(): Color =
    over(MaterialTheme.colorScheme.tertiary)

@Composable
fun Color.overTertiaryContainer(): Color =
    over(MaterialTheme.colorScheme.tertiaryContainer)

@Composable
fun Color.overSurface(): Color =
    over(MaterialTheme.colorScheme.surface)

@Composable
fun Color.overSurfaceVariant(): Color =
    over(MaterialTheme.colorScheme.surfaceVariant)

@Composable
fun Color.overBackground(): Color =
    over(MaterialTheme.colorScheme.background)

