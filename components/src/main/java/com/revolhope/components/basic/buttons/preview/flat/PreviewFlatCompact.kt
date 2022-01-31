package com.revolhope.components.basic.buttons.preview.flat

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewFlatCompactButton() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact Button",
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFlatCompactButtonStartIcon() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact + Start Icon",
            iconStart = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFlatCompactButtonEndIcon() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact + End Icon",
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFlatCompactButtonStartAndEndIcon() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact + Start&End Icon",
            iconStart = R.drawable.ic_email_outlined_gray,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFlatCompactButtonDisabled() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact Button Disabled",
            enabled = false
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewFlatCompactButtonDark() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact Button Dark",
            enabled = true
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewFlatCompactButtonDisabledDark() {
    AppTheme {
        Button.FlatCompact(
            onClick = {},
            text = "FlatCompact Disabled Dark",
            enabled = false
        )
    }
}