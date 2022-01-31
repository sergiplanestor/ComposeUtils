package com.revolhope.components.basic.buttons.preview.icon

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme


@Preview
@Composable
fun PreviewIconButton() {
    AppTheme {
        Button.SingleIcon(
            onClick = {},
            icon = R.drawable.ic_heart_outlined,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewIconButtonDisabled() {
    AppTheme {
        Button.SingleIcon(
            onClick = {},
            icon = R.drawable.ic_heart_outlined,
            enabled = false
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewIconButtonDark() {
    AppTheme {
        Button.SingleIcon(
            onClick = {},
            icon = R.drawable.ic_heart_outlined,
            enabled = true
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewIconButtonDisabledDark() {
    AppTheme {
        Button.SingleIcon(
            onClick = {},
            icon = R.drawable.ic_heart_outlined,
            enabled = false
        )
    }
}