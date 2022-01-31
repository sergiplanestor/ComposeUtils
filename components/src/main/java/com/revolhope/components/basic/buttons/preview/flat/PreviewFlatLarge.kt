package com.revolhope.components.basic.buttons.preview.flat

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewFlatLargeButton() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Large Button",
            size = Button.Size.Large,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFlatLargeButtonStartIcon() {
    AppTheme {
        Button.Flat(
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
fun PreviewFlatLargeButtonEndIcon() {
    AppTheme {
        Button.Flat(
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
fun PreviewFlatLargeButtonStartAndEndIcon() {
    AppTheme {
        Button.Flat(
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
fun PreviewFlatLargeButtonDisabled() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Large Button Disabled",
            size = Button.Size.Large,
            enabled = false
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewFlatLargeButtonDark() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Large Button Dark",
            size = Button.Size.Large,
            enabled = true
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewFlatLargeButtonDisabledDark() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Large Disabled Dark",
            size = Button.Size.Large,
            enabled = false
        )
    }
}