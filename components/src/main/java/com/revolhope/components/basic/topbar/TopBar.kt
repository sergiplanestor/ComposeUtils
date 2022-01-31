package com.revolhope.components.basic.topbar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.revolhope.components.basic.images.Media
import com.revolhope.components.basic.spacers.Spacer
import com.revolhope.components.basic.spacers.model.Small
import com.revolhope.components.basic.spacers.model.SmallTiny
import com.revolhope.components.basic.spacers.model.Tiny
import com.revolhope.components.basic.texts.BaseTextStyle.subtitleTextStyle
import com.revolhope.components.basic.texts.BaseTextStyle.titleTextStyle
import com.revolhope.compose_utils.resources.utils.toStringRes
import com.revolhope.compose_utils.ui.modifier.fillHeight

object TopBar {

    object Content {

        private val iconSize: Dp by lazy { 32.dp }

        @Composable
        fun Title(
            modifier: Modifier = Modifier,
            @StringRes id: Int,
            textStyle: TextStyle = titleTextStyle(),
        ) =
            Title(
                modifier,
                id.toStringRes(),
                textStyle
            )

        @Composable
        fun Title(
            modifier: Modifier = Modifier,
            text: String,
            textStyle: TextStyle = titleTextStyle(),
        ) =
            Text(
                modifier = modifier,
                text = text,
                style = textStyle
            )


        @Composable
        fun TitleSubtitle(
            modifier: Modifier = Modifier,
            @StringRes titleId: Int,
            @StringRes subtitleId: Int,
            titleStyle: TextStyle = titleTextStyle(),
            subtitleStyle: TextStyle = subtitleTextStyle(),
        ) =
            TitleSubtitle(
                modifier,
                titleId.toStringRes(),
                subtitleId.toStringRes(),
                titleStyle,
                subtitleStyle
            )

        @Composable
        fun TitleSubtitle(
            modifier: Modifier = Modifier,
            title: String,
            subtitle: String,
            titleStyle: TextStyle = titleTextStyle(),
            subtitleStyle: TextStyle = subtitleTextStyle(),
        ) =
            Column(
                modifier = modifier.fillHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer.Vertical(SmallTiny)
                Title(text = title, textStyle = titleStyle)
                Spacer.Vertical(Small)
                Text(text = subtitle, style = subtitleStyle)
                Spacer.Vertical(SmallTiny)
            }

        @Composable
        fun Icon(
            modifier: Modifier = Modifier,
            @DrawableRes id: Int,
            iconSize: Dp = Content.iconSize
        ) =
            Media.Image(id = id, size = iconSize)
    }

    object Nav {

        @Composable
        fun Back() {

        }

        @Composable
        fun Close() {

        }

    }

    object Action {

    }

}