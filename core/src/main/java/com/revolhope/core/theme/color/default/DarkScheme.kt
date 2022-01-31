package com.revolhope.core.theme.color.default

import androidx.compose.ui.graphics.Color
import com.revolhope.core.theme.color.scheme.ThemeColorScheme

val defaultDarkColorPrimary: Color by lazy { Palette.Red.ChestnutRose }
val defaultDarkColorOnPrimary: Color by lazy { Palette.Basic.WhiteSoapstone }
val defaultDarkColorPrimaryContainer: Color by lazy { Palette.Red.LightCoral }
val defaultDarkColorOnPrimaryContainer: Color by lazy { Palette.Gray.MineShaft }
val defaultDarkColorInversePrimary: Color by lazy { Palette.Red.ChestnutRose }

val defaultDarkColorSecondary: Color by lazy { Palette.Red.ChestnutRose }
val defaultDarkColorOnSecondary: Color by lazy { Palette.Gray.Dove }
val defaultDarkColorSecondaryContainer: Color by lazy { Palette.Red.CrownOfThrones }
val defaultDarkColorOnSecondaryContainer: Color by lazy { Palette.Red.DelRio }

val defaultDarkColorTertiary: Color by lazy { Palette.Orange.Rajah }
val defaultDarkColorOnTertiary: Color by lazy { Palette.Gray.MineShaft }
val defaultDarkColorTertiaryContainer: Color by lazy { Palette.Orange.DiSerria }
val defaultDarkColorOnTertiaryContainer: Color by lazy { Palette.Gray.RaisinBlack }

val defaultDarkColorBackground: Color by lazy { Palette.Gray.MineShaft }
val defaultDarkColorOnBackground: Color by lazy { Palette.Gray.Mercury }

val defaultDarkColorSurface: Color by lazy { Palette.Gray.Dove }
val defaultDarkColorOnSurface: Color by lazy { Palette.Gray.Mercury }
val defaultDarkColorSurfaceVariant: Color by lazy { Palette.Orange.CapePalliser }
val defaultDarkColorOnSurfaceVariant: Color by lazy { Palette.Orange.Champagne }
val defaultDarkColorInverseSurface: Color by lazy { Palette.Gray.Mercury }
val defaultDarkColorInverseOnSurface: Color by lazy { Palette.Gray.Dove }

val defaultDarkColorError: Color by lazy { Palette.Red.ChestnutRose }
val defaultDarkColorOnError: Color by lazy { Palette.Gray.Mercury }
val defaultDarkColorErrorContainer: Color by lazy { Palette.Red.CornflowerLilac }
val defaultDarkColorOnErrorContainer: Color by lazy { Palette.Red.Ferra }

val defaultDarkColorWarning: Color by lazy { Palette.Orange.Rajah }
val defaultDarkColorOnWarning: Color by lazy { Palette.Gray.RaisinBlack }
val defaultDarkColorWarningContainer: Color by lazy { Palette.Orange.NavajoWhite }
val defaultDarkColorOnWarningContainer: Color by lazy { Palette.Gray.MineShaft }

val defaultDarkColorSuccess: Color by lazy { Palette.Green.ChelseaCucumber }
val defaultDarkColorOnSuccess: Color by lazy { Palette.Gray.MineShaft }
val defaultDarkColorSuccessContainer: Color by lazy { Palette.Green.FernGreen }
val defaultDarkColorOnSuccessContainer: Color by lazy { Palette.Gray.Mercury }

val defaultDarkColorInfo: Color by lazy { Palette.Blue.VioletBlue }
val defaultDarkColorOnInfo: Color by lazy { Palette.Gray.Mercury }
val defaultDarkColorInfoContainer: Color by lazy { Palette.Blue.Rackley }
val defaultDarkColorOnInfoContainer: Color by lazy { Palette.Gray.Mercury }

val defaultDarkColorOutline: Color by lazy { Palette.Gray.Silver }

val DefaultThemeColorSchemeDark: ThemeColorScheme by lazy {
    ThemeColorScheme(
        primary = defaultDarkColorPrimary,
        onPrimary = defaultDarkColorOnPrimary,
        primaryContainer = defaultDarkColorPrimaryContainer,
        onPrimaryContainer = defaultDarkColorOnPrimaryContainer,
        inversePrimary = defaultDarkColorInversePrimary,
        secondary = defaultDarkColorSecondary,
        onSecondary = defaultDarkColorOnSecondary,
        secondaryContainer = defaultDarkColorSecondaryContainer,
        onSecondaryContainer = defaultDarkColorOnSecondaryContainer,
        tertiary = defaultDarkColorTertiary,
        onTertiary = defaultDarkColorOnTertiary,
        tertiaryContainer = defaultDarkColorTertiaryContainer,
        onTertiaryContainer = defaultDarkColorOnTertiaryContainer,
        background = defaultDarkColorBackground,
        onBackground = defaultDarkColorOnBackground,
        surface = defaultDarkColorSurface,
        onSurface = defaultDarkColorOnSurface,
        surfaceVariant = defaultDarkColorSurfaceVariant,
        onSurfaceVariant = defaultDarkColorOnSurfaceVariant,
        inverseSurface = defaultDarkColorInverseSurface,
        inverseOnSurface = defaultDarkColorInverseOnSurface,
        error = defaultDarkColorError,
        onError = defaultDarkColorOnError,
        errorContainer = defaultDarkColorErrorContainer,
        onErrorContainer = defaultDarkColorOnErrorContainer,
        success = defaultDarkColorSuccess,
        onSuccess = defaultDarkColorOnSuccess,
        successContainer = defaultDarkColorSuccessContainer,
        onSuccessContainer = defaultDarkColorOnSuccessContainer,
        warning = defaultDarkColorWarning,
        onWarning = defaultDarkColorOnWarning,
        warningContainer = defaultDarkColorWarningContainer,
        onWarningContainer = defaultDarkColorOnWarningContainer,
        info = defaultDarkColorInfo,
        onInfo = defaultDarkColorOnInfo,
        infoContainer = defaultDarkColorInfoContainer,
        onInfoContainer = defaultDarkColorOnInfoContainer,
        outline = defaultDarkColorOutline
    )
}