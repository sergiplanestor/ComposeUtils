package com.revolhope.components.basic.images

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.revolhope.components.R.string as RStrings
import com.revolhope.compose_utils.resources.utils.toPainter
import com.revolhope.compose_utils.resources.utils.toStringRes

object Media {

    private val defaultIconSize: Dp by lazy { 24.dp }
    private val defaultImageDescription: Int by lazy { RStrings.default_image_content_description }
    private val defaultIconDescription: Int by lazy { RStrings.default_icon_content_description }

    @Composable
    fun Image(
        @DrawableRes id: Int,
        modifier: Modifier = Modifier,
        size: Dp,
        description: String? = null,
        isDescriptionDefault: Boolean = description == null,
        alignment: Alignment = Alignment.Center,
        contentScale: ContentScale = ContentScale.Fit,
        alpha: Float = DefaultAlpha,
        colorFilter: ColorFilter? = null
    ) = androidx.compose.foundation.Image(
        painter = id.toPainter(),
        modifier = modifier.size(size),
        contentDescription = contentDescription(isDescriptionDefault, description, defaultImageDescription),
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter
    )

    @Composable
    fun Icon(
        @DrawableRes id: Int,
        modifier: Modifier = Modifier,
        description: String? = null,
        isDescriptionDefault: Boolean = description == null,
        alignment: Alignment = Alignment.Center,
        contentScale: ContentScale = ContentScale.Fit,
        alpha: Float = DefaultAlpha,
        colorFilter: ColorFilter? = null
    ) =
        androidx.compose.foundation.Image(
            painter = id.toPainter(),
            modifier = modifier.size(size = defaultIconSize),
            contentDescription = contentDescription(isDescriptionDefault, description, defaultIconDescription),
            alignment = alignment,
            contentScale = contentScale,
            alpha = alpha,
            colorFilter = colorFilter
        )

    @Composable
    private fun contentDescription(isDefault: Boolean, description: String?, default: Int): String? =
        if (isDefault) {
            default.toStringRes()
        } else {
            description
        }
}