package com.revolhope.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.revolhope.core.theme.color.material.MaterialColorScheme
import com.revolhope.core.theme.color.material.toMaterialScheme
import com.revolhope.core.theme.color.scheme.ThemeColorScheme
import com.revolhope.core.theme.contract.ThemeContract
import com.revolhope.core.theme.contract.default.DefaultTheme
import com.revolhope.core.theme.distance.scheme.ThemeDistanceScheme
import com.revolhope.core.theme.shape.scheme.ThemeShapeScheme
import com.revolhope.core.theme.typography.material.toMaterial
import com.revolhope.core.theme.typography.scheme.ThemeTypographyScheme

object Theme {

    private var customThemeContract: ThemeContract? = null
    private val themeContract: ThemeContract get() = customThemeContract ?: DefaultTheme

    fun init(contract: ThemeContract) {
        this.customThemeContract = contract
    }

    @Composable
    fun ProvideThemeSchemes(
        colorScheme: ThemeColorScheme,
        shapeScheme: ThemeShapeScheme,
        typographyScheme: ThemeTypographyScheme,
        distancesScheme: ThemeDistanceScheme,
        content: @Composable () -> Unit
    ) {
        CompositionLocalProvider(
            LocalColorScheme provides colorScheme,
            LocalMaterialColorScheme provides colorScheme.toMaterialScheme(),
            LocalThemeShapeScheme provides shapeScheme,
            LocalTypographyScheme provides typographyScheme,
            LocalDistancesScheme provides distancesScheme,
            content = content
        )
    }

    private val LocalColorScheme = staticCompositionLocalOf<ThemeColorScheme> {
        error("No ColorContract provided")
    }

    private val LocalMaterialColorScheme = staticCompositionLocalOf<MaterialColorScheme> {
        error("No ColorContract provided")
    }

    private val LocalThemeShapeScheme = staticCompositionLocalOf<ThemeShapeScheme> {
        error("No ThemeShape provided")
    }

    private val LocalTypographyScheme = staticCompositionLocalOf<ThemeTypographyScheme> {
        error("No TypographyScheme provided")
    }

    private val LocalDistancesScheme = staticCompositionLocalOf<ThemeDistanceScheme> {
        error("No DistancesScheme provided")
    }

    val Colors: ThemeColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    val ColorsMaterial: MaterialColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalMaterialColorScheme.current

    val Shapes: ThemeShapeScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalThemeShapeScheme.current

    val Typographies: ThemeTypographyScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalTypographyScheme.current

    val Distances: ThemeDistanceScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalDistancesScheme.current

    @Composable
    fun AppTheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit,
    ) {

        val typographyScheme = themeContract.typographies.scheme
        ProvideThemeSchemes(
            colorScheme = if (darkTheme) themeContract.colors.darkScheme else themeContract.colors.lightScheme,
            shapeScheme = themeContract.shapes.scheme,
            typographyScheme = typographyScheme,
            distancesScheme = themeContract.distances.scheme
        ) {
            MaterialTheme(
                colorScheme = ColorsMaterial,
                typography = typographyScheme.toMaterial(),
                content = content
            )
        }
    }
}

val ThemeColors: ThemeColorScheme
    @Composable
    @ReadOnlyComposable
    get() = Theme.Colors

val ThemeColorsMaterial: MaterialColorScheme
    @Composable
    @ReadOnlyComposable
    get() = Theme.ColorsMaterial

val ThemeTypographies: ThemeTypographyScheme
    @Composable
    @ReadOnlyComposable
    get() = Theme.Typographies

val ThemeDistances: ThemeDistanceScheme
    @Composable
    @ReadOnlyComposable
    get() = Theme.Distances

