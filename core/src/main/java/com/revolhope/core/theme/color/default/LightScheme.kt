package com.revolhope.core.theme.color.default

import androidx.compose.ui.graphics.Color
import com.revolhope.core.theme.color.scheme.ThemeColorScheme

val defaultLightColorPrimary: Color by lazy { Palette.Red.Tosca }
val defaultLightColorOnPrimary: Color by lazy { Palette.Basic.WhiteSoapstone }
val defaultLightColorPrimaryContainer: Color by lazy { Palette.Red.LightCoral }
val defaultLightColorOnPrimaryContainer: Color by lazy { Palette.Gray.MineShaft }
val defaultLightColorInversePrimary: Color by lazy { Palette.Red.Tosca }

val defaultLightColorSecondary: Color by lazy { Palette.Red.CrownOfThrones }
val defaultLightColorOnSecondary: Color by lazy { Palette.Basic.WhiteSoapstone }
val defaultLightColorSecondaryContainer: Color by lazy { Palette.Red.ChestnutRose }
val defaultLightColorOnSecondaryContainer: Color by lazy { Palette.Gray.Mercury }

val defaultLightColorTertiary: Color by lazy { Palette.Orange.Koromiko }
val defaultLightColorOnTertiary: Color by lazy { Palette.Gray.MineShaft }
val defaultLightColorTertiaryContainer: Color by lazy { Palette.Orange.NavajoWhite }
val defaultLightColorOnTertiaryContainer: Color by lazy { Palette.Gray.MineShaft }

val defaultLightColorBackground: Color by lazy { Palette.Basic.WhiteSoapstone }
val defaultLightColorOnBackground: Color by lazy { Palette.Gray.RaisinBlack }

val defaultLightColorSurface: Color by lazy { Palette.Basic.WhiteSoapstone }
val defaultLightColorOnSurface: Color by lazy { Palette.Gray.RaisinBlack }
val defaultLightColorSurfaceVariant: Color by lazy { Palette.Orange.Champagne }
val defaultLightColorOnSurfaceVariant: Color by lazy { Palette.Orange.CapePalliser }
val defaultLightColorInverseSurface: Color by lazy { Palette.Gray.RaisinBlack }
val defaultLightColorInverseOnSurface: Color by lazy { Palette.Basic.WhiteSoapstone }

val defaultLightColorError: Color by lazy { Palette.Red.MexicanRed }
val defaultLightColorOnError: Color by lazy { Palette.Basic.WhiteSoapstone }
val defaultLightColorErrorContainer: Color by lazy { Palette.Red.CornflowerLilac }
val defaultLightColorOnErrorContainer: Color by lazy { Palette.Red.DarkChocolate }

val defaultLightColorWarning: Color by lazy { Palette.Orange.NavajoWhite }
val defaultLightColorOnWarning: Color by lazy { Palette.Gray.RaisinBlack }
val defaultLightColorWarningContainer: Color by lazy { Palette.Orange.CapePalliser }
val defaultLightColorOnWarningContainer: Color by lazy { Palette.Gray.MineShaft }

val defaultLightColorSuccess: Color by lazy { Palette.Green.Conifer }
val defaultLightColorOnSuccess: Color by lazy { Palette.Gray.MineShaft }
val defaultLightColorSuccessContainer: Color by lazy { Palette.Green.Coriander }
val defaultLightColorOnSuccessContainer: Color by lazy { Palette.Gray.MineShaft }

val defaultLightColorInfo: Color by lazy { Palette.Blue.Royal }
val defaultLightColorOnInfo: Color by lazy { Palette.Gray.Mercury }
val defaultLightColorInfoContainer: Color by lazy { Palette.Blue.VistaBlue }
val defaultLightColorOnInfoContainer: Color by lazy { Palette.Gray.Mercury }

val defaultLightColorOutline: Color by lazy { Palette.Gray.DimGray }

val DefaultThemeColorSchemeLight: ThemeColorScheme by lazy {
    ThemeColorScheme(
        primary = defaultLightColorPrimary,
        onPrimary = defaultLightColorOnPrimary,
        primaryContainer = defaultLightColorPrimaryContainer,
        onPrimaryContainer = defaultLightColorOnPrimaryContainer,
        inversePrimary = defaultLightColorInversePrimary,
        secondary = defaultLightColorSecondary,
        onSecondary = defaultLightColorOnSecondary,
        secondaryContainer = defaultLightColorSecondaryContainer,
        onSecondaryContainer = defaultLightColorOnSecondaryContainer,
        tertiary = defaultLightColorTertiary,
        onTertiary = defaultLightColorOnTertiary,
        tertiaryContainer = defaultLightColorTertiaryContainer,
        onTertiaryContainer = defaultLightColorOnTertiaryContainer,
        background = defaultLightColorBackground,
        onBackground = defaultLightColorOnBackground,
        surface = defaultLightColorSurface,
        onSurface = defaultLightColorOnSurface,
        surfaceVariant = defaultLightColorSurfaceVariant,
        onSurfaceVariant = defaultLightColorOnSurfaceVariant,
        inverseSurface = defaultLightColorInverseSurface,
        inverseOnSurface = defaultLightColorInverseOnSurface,
        error = defaultLightColorError,
        onError = defaultLightColorOnError,
        errorContainer = defaultLightColorErrorContainer,
        onErrorContainer = defaultLightColorOnErrorContainer,
        success = defaultLightColorSuccess,
        onSuccess = defaultLightColorOnSuccess,
        successContainer = defaultLightColorSuccessContainer,
        onSuccessContainer = defaultLightColorOnSuccessContainer,
        warning = defaultLightColorWarning,
        onWarning = defaultLightColorOnWarning,
        warningContainer = defaultLightColorWarningContainer,
        onWarningContainer = defaultLightColorOnWarningContainer,
        info = defaultLightColorInfo,
        onInfo = defaultLightColorOnInfo,
        infoContainer = defaultLightColorInfoContainer,
        onInfoContainer = defaultLightColorOnInfoContainer,
        outline = defaultLightColorOutline
    )
}