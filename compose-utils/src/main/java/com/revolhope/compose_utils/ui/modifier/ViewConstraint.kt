package com.revolhope.compose_utils.ui.modifier

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

sealed class ViewConstraint
object Fill : ViewConstraint()
object Wrap : ViewConstraint()

fun Modifier.width(constraint: ViewConstraint): Modifier = this.then(
    when (constraint) {
        Fill -> fillWidth()
        Wrap -> wrapWidth()
    }
)

fun Modifier.height(constraint: ViewConstraint): Modifier = this.then(
    when (constraint) {
        Fill -> fillHeight()
        Wrap -> wrapHeight()
    }
)

fun Modifier.size(w: ViewConstraint = Fill, h: ViewConstraint = Wrap): Modifier = this
    .width(w)
    .height(h)

fun Modifier.fillSize(fraction: Float = 1f): Modifier = this.then(Modifier.fillMaxSize(fraction))

fun Modifier.wrapSize(
    align: Alignment = Alignment.Center,
    unbounded: Boolean = false
): Modifier = this.then(Modifier.wrapContentSize(align, unbounded))

fun Modifier.fillWidth(fraction: Float = 1f): Modifier = this.then(Modifier.fillMaxWidth(fraction))

fun Modifier.wrapWidth(
    align: Alignment.Horizontal = Alignment.CenterHorizontally,
    unbounded: Boolean = false
): Modifier = this.then(Modifier.wrapContentWidth(align, unbounded))

fun Modifier.fillHeight(fraction: Float = 1f): Modifier =
    this.then(Modifier.fillMaxHeight(fraction))

fun Modifier.wrapHeight(
    align: Alignment.Vertical = Alignment.CenterVertically,
    unbounded: Boolean = false
): Modifier = this.then(Modifier.wrapContentHeight(align, unbounded))
