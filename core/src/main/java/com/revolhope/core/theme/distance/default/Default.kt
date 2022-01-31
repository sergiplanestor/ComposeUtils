package com.revolhope.core.theme.distance.default

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.revolhope.core.theme.distance.scheme.ThemeDistanceScheme

val DefaultThemeDistanceScheme: ThemeDistanceScheme by lazy {
    ThemeDistanceScheme(
        tiny = DefaultDistanceTiny,
        smallTiny = DefaultDistanceSmallTiny,
        small = DefaultDistanceSmall,
        mediumSmall = DefaultDistanceMediumSmall,
        medium = DefaultDistanceMedium,
        mediumLarge = DefaultDistanceMediumLarge,
        large = DefaultDistanceLarge,
        largeHuge = DefaultDistanceLargeHuge,
        huge = DefaultDistanceHuge
    )
}

val DefaultDistanceTiny: Dp by lazy { 4.dp }

val DefaultDistanceSmallTiny: Dp by lazy { 6.dp }

val DefaultDistanceSmall: Dp by lazy { 8.dp }

val DefaultDistanceMediumSmall: Dp by lazy { 12.dp }

val DefaultDistanceMedium: Dp by lazy { 16.dp }

val DefaultDistanceMediumLarge: Dp by lazy { 20.dp }

val DefaultDistanceLarge: Dp by lazy { 24.dp }

val DefaultDistanceLargeHuge: Dp by lazy { 32.dp }

val DefaultDistanceHuge: Dp by lazy { 36.dp }

val DefaultDistanceHeadline2Title: Dp by lazy { DefaultDistanceMedium }

val DefaultDistanceTitle2Body: Dp by lazy { DefaultDistanceMediumSmall }

val DefaultDistanceText2Button: Dp by lazy { DefaultDistanceMediumLarge }

val DefaultMarginHorizontal: Dp by lazy { DefaultDistanceMediumLarge }

val DefaultMarginVertical: Dp by lazy { DefaultDistanceLarge }