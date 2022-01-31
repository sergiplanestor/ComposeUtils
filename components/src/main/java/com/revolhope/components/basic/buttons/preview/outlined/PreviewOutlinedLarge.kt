package com.revolhope.components.basic.buttons.preview.outlined

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewOutlinedLargeButton() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large Button",
            size = Button.Size.Large,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedLargeButtonStartIcon() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large + Start Icon",
            size = Button.Size.Large,
            iconStart = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedLargeButtonEndIcon() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large + End Icon",
            size = Button.Size.Large,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedLargeButtonStartAndEndIcon() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large + Start&End Icon",
            size = Button.Size.Large,
            iconStart = R.drawable.ic_email_outlined_gray,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedLargeButtonDisabled() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large Button Disabled",
            size = Button.Size.Large,
            enabled = false
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewOutlinedLargeButtonDark() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large Button Dark",
            size = Button.Size.Large,
            enabled = true
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewOutlinedLargeButtonDisabledDark() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Large Disabled Dark",
            size = Button.Size.Large,
            enabled = false
        )
    }
}