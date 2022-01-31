package com.revolhope.core.theme.contract.default

import com.revolhope.core.theme.color.default.DefaultThemeColorSchemeDark
import com.revolhope.core.theme.color.default.DefaultThemeColorSchemeLight
import com.revolhope.core.theme.contract.ThemeContract
import com.revolhope.core.theme.distance.default.DefaultThemeDistanceScheme
import com.revolhope.core.theme.shape.default.DefaultThemeShapeScheme
import com.revolhope.core.theme.typography.default.DefaultThemeTypographyScheme


val DefaultTheme: ThemeContract by lazy {
    ThemeContract.create(
        lightColorScheme = DefaultThemeColorSchemeLight,
        darkColorScheme = DefaultThemeColorSchemeDark,
        shapeScheme = DefaultThemeShapeScheme,
        typographyScheme = DefaultThemeTypographyScheme,
        distanceScheme = DefaultThemeDistanceScheme,
    )
}