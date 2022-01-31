package com.revolhope.components.basic.buttons.preview.outlined

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewOutlinedCompactButton() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact Button",
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedCompactButtonStartIcon() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact + Start Icon",
            iconStart = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedCompactButtonEndIcon() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact + End Icon",
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedCompactButtonStartAndEndIcon() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact + Start&End Icon",
            iconStart = R.drawable.ic_email_outlined_gray,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedCompactButtonDisabled() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact Button Disabled",
            enabled = false
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewOutlinedCompactButtonDark() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact Button Dark",
            enabled = true
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewOutlinedCompactButtonDisabledDark() {
    AppTheme {
        Button.OutlinedCompact(
            onClick = {},
            text = "Compact Disabled Dark",
            enabled = false
        )
    }
}