package com.revolhope.core.theme.shape.default

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import com.revolhope.core.theme.shape.model.ThemeShape
import com.revolhope.core.theme.shape.scheme.ThemeShapeScheme

val DefaultShape_XL: RoundedCornerShape by lazy { RoundedCornerShape(4.dp) }
val DefaultShape_L: RoundedCornerShape by lazy { RoundedCornerShape(4.dp) }
val DefaultShape_M: RoundedCornerShape by lazy { RoundedCornerShape(6.dp) }
val DefaultShape_S: RoundedCornerShape by lazy { RoundedCornerShape(6.dp) }
val DefaultShape_XS: RoundedCornerShape by lazy { RoundedCornerShape(8.dp) }

val DefaultThemeShape: ThemeShape by lazy {
    ThemeShape(
        XL = DefaultShape_XL,
        L = DefaultShape_L,
        M = DefaultShape_M,
        S = DefaultShape_S,
        XS = DefaultShape_XS
    )
}

val DefaultThemeShapeScheme: ThemeShapeScheme by lazy { ThemeShapeScheme(shape = DefaultThemeShape) }