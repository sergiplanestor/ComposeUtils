package com.revolhope.core.theme.shape.model

import androidx.compose.foundation.shape.RoundedCornerShape
import com.revolhope.core.theme.ThemeSizes

data class ThemeShape(
    override val XL: RoundedCornerShape,
    override val L: RoundedCornerShape,
    override val M: RoundedCornerShape,
    override val S: RoundedCornerShape,
    override val XS: RoundedCornerShape
) : ThemeSizes<RoundedCornerShape>
