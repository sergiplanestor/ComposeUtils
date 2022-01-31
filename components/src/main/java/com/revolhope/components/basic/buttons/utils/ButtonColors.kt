package com.revolhope.components.basic.buttons.utils

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import com.revolhope.compose_utils.ui.theme.colors.disableOverSurface
import com.revolhope.core.theme.ThemeColorsMaterial

@Composable
internal fun filledColors() = ButtonDefaults.buttonColors(
    containerColor = ThemeColorsMaterial.primary,
    contentColor = ThemeColorsMaterial.onPrimary,
    disabledContainerColor = ThemeColorsMaterial.onSurface.disableOverSurface(),
    disabledContentColor = ThemeColorsMaterial.onPrimary,
)

@Composable
internal fun outlinedColors() = ButtonDefaults.outlinedButtonColors(
    contentColor = ThemeColorsMaterial.primary,
    disabledContentColor = ThemeColorsMaterial.primary.disableOverSurface(0.6f),
)