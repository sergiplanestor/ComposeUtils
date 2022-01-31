package com.revolhope.core.theme.typography.model

import androidx.compose.ui.text.TextStyle
import com.revolhope.core.theme.ThemeSizes

data class ThemeTextStyle(
    override val XL: TextStyle,
    override val L: TextStyle,
    override val M: TextStyle,
    override val S: TextStyle,
    override val XS: TextStyle
) : ThemeSizes<TextStyle> {
    constructor(L: TextStyle, M: TextStyle, S: TextStyle) : this(
        XL = L,
        L = L,
        M = M,
        S = S,
        XS = S
    )
}
