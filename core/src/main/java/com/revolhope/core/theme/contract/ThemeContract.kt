package com.revolhope.core.theme.contract

import com.revolhope.core.theme.color.scheme.ThemeColorScheme
import com.revolhope.core.theme.distance.scheme.ThemeDistanceScheme
import com.revolhope.core.theme.shape.scheme.ThemeShapeScheme
import com.revolhope.core.theme.typography.scheme.ThemeTypographyScheme

interface ThemeContract {

    val colors: Colors
    val shapes: Shapes
    val typographies: Typographies
    val distances: Distances

    interface Colors {
        val lightScheme: ThemeColorScheme
        val darkScheme: ThemeColorScheme
        companion object {
            fun create(lightScheme: ThemeColorScheme, darkScheme: ThemeColorScheme): Colors =
                object : Colors {
                    override val lightScheme: ThemeColorScheme = lightScheme
                    override val darkScheme: ThemeColorScheme = darkScheme
                }
        }
    }

    interface Shapes {
        val scheme: ThemeShapeScheme
        companion object {
            fun create(scheme: ThemeShapeScheme): Shapes =
                object : Shapes {
                    override val scheme: ThemeShapeScheme = scheme
                }
        }
    }

    interface Typographies {
        val scheme: ThemeTypographyScheme
        companion object {
            fun create(scheme: ThemeTypographyScheme): Typographies =
                object : Typographies {
                    override val scheme: ThemeTypographyScheme = scheme
                }
        }
    }

    interface Distances {
        val scheme: ThemeDistanceScheme
        companion object {
            fun create(scheme: ThemeDistanceScheme): Distances =
                object : Distances {
                    override val scheme: ThemeDistanceScheme = scheme
                }
        }
    }

    companion object {
        fun create(
            lightColorScheme: ThemeColorScheme,
            darkColorScheme: ThemeColorScheme,
            shapeScheme: ThemeShapeScheme,
            typographyScheme: ThemeTypographyScheme,
            distanceScheme: ThemeDistanceScheme,
        ): ThemeContract =
            object : ThemeContract {
                override val colors: Colors = Colors.create(lightColorScheme, darkColorScheme)
                override val shapes: Shapes = Shapes.create(shapeScheme)
                override val typographies: Typographies = Typographies.create(typographyScheme)
                override val distances: Distances = Distances.create(distanceScheme)
            }
    }
}