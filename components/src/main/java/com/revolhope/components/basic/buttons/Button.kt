package com.revolhope.components.basic.buttons

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.revolhope.components.basic.buttons.utils.filledColors
import com.revolhope.components.basic.buttons.utils.height
import com.revolhope.components.basic.buttons.utils.iconSize
import com.revolhope.components.basic.buttons.utils.outlinedColors
import com.revolhope.components.basic.buttons.utils.typo
import com.revolhope.components.basic.buttons.utils.width
import com.revolhope.compose_utils.resources.utils.toStringRes
import com.revolhope.core.theme.ThemeDistances

object Button {

    private val outlinedBorderSize: Dp by lazy { 1.dp }

    open class Size {
        object Small : Size()
        object Compact : Size()
        object Medium : Size()
        object Large : Size()
    }

    open class Style {
        object Filled : Style()
        object Outlined : Style()
        object Flat : Style()
    }

    @Composable
    fun Filled(
        @StringRes id: Int,
        modifier: Modifier = Modifier,
        size: Size = Size.Medium,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) = Filled(
        id.toStringRes(),
        modifier,
        size,
        iconStart,
        iconEnd,
        enabled,
        onClick
    )

    @Composable
    fun Filled(
        text: String,
        modifier: Modifier = Modifier,
        size: Size = Size.Medium,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) {
        GenericButton(
            text = text,
            onClick = onClick,
            modifier = modifier.height(size),
            enabled = enabled,
            colors = filledColors(),
            textStyle = size.typo(),
            iconStart = iconStart,
            iconEnd = iconEnd,
            iconSize = size.iconSize()
        )
    }

    @Composable
    fun Outlined(
        @StringRes id: Int,
        modifier: Modifier = Modifier,
        size: Size = Size.Medium,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) = Outlined(
        id.toStringRes(),
        modifier,
        size,
        iconStart,
        iconEnd,
        enabled,
        onClick
    )

    @Composable
    fun Outlined(
        text: String,
        modifier: Modifier = Modifier,
        size: Size = Size.Medium,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) {
        GenericButton(
            text = text,
            onClick = onClick,
            modifier = modifier.height(size),
            enabled = enabled,
            colors = outlinedColors(),
            textStyle = size.typo(),
            iconStart = iconStart,
            iconEnd = iconEnd,
            iconSize = size.iconSize(),
            borderSize = outlinedBorderSize
        )
    }

    @Composable
    fun OutlinedCompact(
        @StringRes id: Int,
        modifier: Modifier = Modifier,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) = OutlinedCompact(
        id.toStringRes(),
        modifier,
        iconStart,
        iconEnd,
        enabled,
        onClick
    )

    @Composable
    fun OutlinedCompact(
        text: String,
        modifier: Modifier = Modifier,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) {
        GenericButton(
            text = text,
            onClick = onClick,
            modifier = modifier.height(Size.Compact),
            enabled = enabled,
            colors = outlinedColors(),
            textStyle = Size.Medium.typo(),
            iconStart = iconStart,
            iconEnd = iconEnd,
            iconSize = Size.Medium.iconSize(),
            borderSize = outlinedBorderSize,
            contentPadding = ThemeDistances.small
        )
    }

    @Composable
    fun Flat(
        @StringRes id: Int,
        modifier: Modifier = Modifier,
        size: Size = Size.Medium,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) = Flat(
        id.toStringRes(),
        modifier,
        size,
        iconStart,
        iconEnd,
        enabled,
        onClick
    )

    @Composable
    fun Flat(
        text: String,
        modifier: Modifier = Modifier,
        size: Size = Size.Medium,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) {
        GenericButton(
            text = text,
            onClick = onClick,
            modifier = modifier.height(size),
            enabled = enabled,
            colors = outlinedColors(),
            textStyle = size.typo(),
            iconStart = iconStart,
            iconEnd = iconEnd,
            iconSize = size.iconSize()
        )
    }

    @Composable
    fun FlatCompact(
        @StringRes id: Int,
        modifier: Modifier = Modifier,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) = FlatCompact(
        id.toStringRes(),
        modifier,
        iconStart,
        iconEnd,
        enabled,
        onClick
    )

    @Composable
    fun FlatCompact(
        text: String,
        modifier: Modifier = Modifier,
        @DrawableRes iconStart: Int? = null,
        @DrawableRes iconEnd: Int? = null,
        enabled: Boolean,
        onClick: () -> Unit
    ) {
        GenericButton(
            text = text,
            onClick = onClick,
            modifier = modifier.height(Size.Compact),
            enabled = enabled,
            colors = outlinedColors(),
            textStyle = Size.Medium.typo(),
            iconStart = iconStart,
            iconEnd = iconEnd,
            iconSize = Size.Medium.iconSize(),
            contentPadding = ThemeDistances.small
        )
    }

    @Composable
    fun SingleIcon(
        modifier: Modifier = Modifier,
        @DrawableRes icon: Int,
        enabled: Boolean,
        onClick: () -> Unit
    ) {
        GenericButton(
            text = "",
            onClick = onClick,
            modifier = modifier
                .height(Size.Compact)
                .width(Size.Compact),
            enabled = enabled,
            colors = outlinedColors(),
            textStyle = Size.Compact.typo(),
            iconStart = icon,
            iconEnd = null,
            iconSize = Size.Compact.iconSize(),
            contentPadding = ThemeDistances.small
        )
    }

    @Composable
    fun GenericButton(
        text: String,
        modifier: Modifier,
        enabled: Boolean,
        @DrawableRes iconStart: Int?,
        @DrawableRes iconEnd: Int?,
        iconSize: Dp,
        borderSize: Dp? = null,
        colors: ButtonColors,
        textStyle: TextStyle,
        contentPadding: Dp = ThemeDistances.medium,
        onClick: () -> Unit
    ) {
        TextButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            colors = colors,
            shape = RoundedCornerShape(8.dp), // TODO Check ThemeContract.Shapes
            border = borderSize?.run {
                BorderStroke(
                    this,
                    colors.contentColor(enabled = enabled).value
                )
            },
            contentPadding = PaddingValues(horizontal = contentPadding)
        ) {
            // Start Icon
            ContentIcon(iconStart, iconSize)
            // Text and spaces
            text.takeUnless { it.isBlank() }?.run {
                ContentText(
                    text = text,
                    textStyle = textStyle,
                    hasStartIcon = iconStart != null,
                    hasEndIcon = iconEnd != null
                )
            }
            // End Icon
            iconEnd.takeIf { iconStart == null }?.run {
                ContentIcon(this, iconSize)
            }
        }
    }

    @Composable
    fun ContentIcon(@DrawableRes icon: Int?, iconSize: Dp) {
        icon?.let {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                Modifier.size(iconSize)
            )
        }
    }

    @Composable
    fun ContentText(
        text: String,
        textStyle: TextStyle,
        hasStartIcon: Boolean,
        hasEndIcon: Boolean
    ) {
        if (hasStartIcon) {
            Spacer(modifier = Modifier.size(ThemeDistances.mediumSmall))
        }
        Text(
            text = text,
            style = textStyle,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
        if (!hasStartIcon && hasEndIcon) {
            Spacer(modifier = Modifier.size(ThemeDistances.mediumSmall))
        }
    }
}
