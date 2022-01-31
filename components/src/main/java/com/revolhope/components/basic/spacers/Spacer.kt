package com.revolhope.components.basic.spacers

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.revolhope.components.basic.spacers.model.Headline2Title
import com.revolhope.components.basic.spacers.model.Huge
import com.revolhope.components.basic.spacers.model.Large
import com.revolhope.components.basic.spacers.model.LargeHuge
import com.revolhope.components.basic.spacers.model.Medium
import com.revolhope.components.basic.spacers.model.MediumLarge
import com.revolhope.components.basic.spacers.model.MediumSmall
import com.revolhope.components.basic.spacers.model.Small
import com.revolhope.components.basic.spacers.model.SmallTiny
import com.revolhope.components.basic.spacers.model.SpacerDistance
import com.revolhope.components.basic.spacers.model.Text2Button
import com.revolhope.components.basic.spacers.model.Tiny
import com.revolhope.components.basic.spacers.model.Title2Body
import com.revolhope.core.theme.ThemeDistances
import com.revolhope.core.theme.distance.default.DefaultDistanceHeadline2Title
import com.revolhope.core.theme.distance.default.DefaultDistanceText2Button
import com.revolhope.core.theme.distance.default.DefaultDistanceTitle2Body

object Spacer {

    private inline val SpacerDistance.dp: Dp
        @Composable
        @ReadOnlyComposable
        get() = when(this) {
            Tiny -> ThemeDistances.tiny
            SmallTiny -> ThemeDistances.smallTiny
            Small -> ThemeDistances.small
            MediumSmall -> ThemeDistances.mediumSmall
            Medium -> ThemeDistances.medium
            MediumLarge -> ThemeDistances.mediumLarge
            Large -> ThemeDistances.large
            LargeHuge -> ThemeDistances.largeHuge
            Huge -> ThemeDistances.huge
            Headline2Title -> DefaultDistanceHeadline2Title
            Title2Body -> DefaultDistanceTitle2Body
            Text2Button -> DefaultDistanceText2Button
        }

    @Composable
    fun Vertical(distance: SpacerDistance) {
        Spacer(modifier = Modifier.height(distance.dp))
    }

    @Composable
    fun Horizontal(distance: SpacerDistance) {
        Spacer(modifier = Modifier.width(distance.dp))
    }
}
