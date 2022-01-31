package com.revolhope.components.basic.texts

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.revolhope.core.theme.ThemeTypographies

object BaseTextStyle {

    @Composable
    fun brandTextStyle(): TextStyle {
        TODO()
    }

    @Composable
    fun decorTextStyle(): TextStyle {
        TODO()
    }

    @Composable
    fun displayTextStyle(): TextStyle {
        TODO()
    }

    @Composable
    fun headlineTextStyle(): TextStyle {
        TODO()
    }

    @Composable
    fun titleTextStyle(): TextStyle = ThemeTypographies.headline.S // TODO Check

    @Composable
    fun subtitleTextStyle(): TextStyle = ThemeTypographies.title.S

    @Composable
    fun bodyTextStyle(): TextStyle {
        TODO()
    }

    @Composable
    fun hintTextStyle(): TextStyle {
        TODO()
    }

    @Composable
    fun labelTextStyle(): TextStyle {
        TODO()
    }
}