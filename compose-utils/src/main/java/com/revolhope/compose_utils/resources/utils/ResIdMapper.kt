package com.revolhope.compose_utils.resources.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun Int.toPainter(): Painter = painterResource(id = this)

@Composable
fun Int.toStringRes(): String = stringResource(id = this)