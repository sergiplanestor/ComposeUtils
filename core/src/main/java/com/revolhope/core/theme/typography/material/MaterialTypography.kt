package com.revolhope.core.theme.typography.material

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import com.revolhope.core.theme.typography.scheme.ThemeTypographyScheme

typealias MaterialTypography = Typography

inline val MaterialTypographyScheme.DisplayLarge: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.DisplayLargeFont,
    fontWeight = MaterialTypeScale.DisplayLargeWeight,
    fontSize = MaterialTypeScale.DisplayLargeSize,
    lineHeight = MaterialTypeScale.DisplayLargeLineHeight,
    letterSpacing = MaterialTypeScale.DisplayLargeTracking,
)

inline val MaterialTypographyScheme.DisplayMedium: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.DisplayMediumFont,
    fontWeight = MaterialTypeScale.DisplayMediumWeight,
    fontSize = MaterialTypeScale.DisplayMediumSize,
    lineHeight = MaterialTypeScale.DisplayMediumLineHeight,
    letterSpacing = MaterialTypeScale.DisplayMediumTracking,
)
inline val MaterialTypographyScheme.DisplaySmall: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.DisplaySmallFont,
    fontWeight = MaterialTypeScale.DisplaySmallWeight,
    fontSize = MaterialTypeScale.DisplaySmallSize,
    lineHeight = MaterialTypeScale.DisplaySmallLineHeight,
    letterSpacing = MaterialTypeScale.DisplaySmallTracking,
)

inline val MaterialTypographyScheme.HeadlineLarge: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.HeadlineLargeFont,
    fontWeight = MaterialTypeScale.HeadlineLargeWeight,
    fontSize = MaterialTypeScale.HeadlineLargeSize,
    lineHeight = MaterialTypeScale.HeadlineLargeLineHeight,
    letterSpacing = MaterialTypeScale.HeadlineLargeTracking,
)
inline val MaterialTypographyScheme.HeadlineMedium: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.HeadlineMediumFont,
    fontWeight = MaterialTypeScale.HeadlineMediumWeight,
    fontSize = MaterialTypeScale.HeadlineMediumSize,
    lineHeight = MaterialTypeScale.HeadlineMediumLineHeight,
    letterSpacing = MaterialTypeScale.HeadlineMediumTracking,
)
inline val MaterialTypographyScheme.HeadlineSmall: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.HeadlineSmallFont,
    fontWeight = MaterialTypeScale.HeadlineSmallWeight,
    fontSize = MaterialTypeScale.HeadlineSmallSize,
    lineHeight = MaterialTypeScale.HeadlineSmallLineHeight,
    letterSpacing = MaterialTypeScale.HeadlineSmallTracking,
)

inline val MaterialTypographyScheme.TitleLarge: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.TitleLargeFont,
    fontWeight = MaterialTypeScale.TitleLargeWeight,
    fontSize = MaterialTypeScale.TitleLargeSize,
    lineHeight = MaterialTypeScale.TitleLargeLineHeight,
    letterSpacing = MaterialTypeScale.TitleLargeTracking,
)
inline val MaterialTypographyScheme.TitleMedium: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.TitleMediumFont,
    fontWeight = MaterialTypeScale.TitleMediumWeight,
    fontSize = MaterialTypeScale.TitleMediumSize,
    lineHeight = MaterialTypeScale.TitleMediumLineHeight,
    letterSpacing = MaterialTypeScale.TitleMediumTracking,
)
inline val MaterialTypographyScheme.TitleSmall: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.TitleSmallFont,
    fontWeight = MaterialTypeScale.TitleSmallWeight,
    fontSize = MaterialTypeScale.TitleSmallSize,
    lineHeight = MaterialTypeScale.TitleSmallLineHeight,
    letterSpacing = MaterialTypeScale.TitleSmallTracking,
)

inline val MaterialTypographyScheme.BodyLarge: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.BodyLargeFont,
    fontWeight = MaterialTypeScale.BodyLargeWeight,
    fontSize = MaterialTypeScale.BodyLargeSize,
    lineHeight = MaterialTypeScale.BodyLargeLineHeight,
    letterSpacing = MaterialTypeScale.BodyLargeTracking,
)
inline val MaterialTypographyScheme.BodyMedium: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.BodyMediumFont,
    fontWeight = MaterialTypeScale.BodyMediumWeight,
    fontSize = MaterialTypeScale.BodyMediumSize,
    lineHeight = MaterialTypeScale.BodyMediumLineHeight,
    letterSpacing = MaterialTypeScale.BodyMediumTracking,
)
inline val MaterialTypographyScheme.BodySmall: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.BodySmallFont,
    fontWeight = MaterialTypeScale.BodySmallWeight,
    fontSize = MaterialTypeScale.BodySmallSize,
    lineHeight = MaterialTypeScale.BodySmallLineHeight,
    letterSpacing = MaterialTypeScale.BodySmallTracking,
)

inline val MaterialTypographyScheme.LabelLarge: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.LabelLargeFont,
    fontWeight = MaterialTypeScale.LabelLargeWeight,
    fontSize = MaterialTypeScale.LabelLargeSize,
    lineHeight = MaterialTypeScale.LabelLargeLineHeight,
    letterSpacing = MaterialTypeScale.LabelLargeTracking,
)
inline val MaterialTypographyScheme.LabelMedium: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.LabelMediumFont,
    fontWeight = MaterialTypeScale.LabelMediumWeight,
    fontSize = MaterialTypeScale.LabelMediumSize,
    lineHeight = MaterialTypeScale.LabelMediumLineHeight,
    letterSpacing = MaterialTypeScale.LabelMediumTracking,
)
inline val MaterialTypographyScheme.LabelSmall: TextStyle get() = TextStyle(
    fontFamily = MaterialTypeScale.LabelSmallFont,
    fontWeight = MaterialTypeScale.LabelSmallWeight,
    fontSize = MaterialTypeScale.LabelSmallSize,
    lineHeight = MaterialTypeScale.LabelSmallLineHeight,
    letterSpacing = MaterialTypeScale.LabelSmallTracking,
)

fun ThemeTypographyScheme.toMaterial(): MaterialTypography =
    MaterialTypography(
        displayLarge = display.L,
        displayMedium =  display.M,
        displaySmall =  display.S,
        headlineLarge = headline.L,
        headlineMedium = headline.M,
        headlineSmall = headline.S,
        titleLarge = title.L,
        titleMedium = title.M,
        titleSmall = title.S,
        bodyLarge = body.L,
        bodyMedium = body.M,
        bodySmall = body.S,
        labelLarge = label.L,
        labelMedium = label.M,
        labelSmall = label.S
    )
