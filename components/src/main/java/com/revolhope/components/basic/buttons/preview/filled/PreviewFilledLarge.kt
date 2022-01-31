package com.revolhope.components.basic.buttons.preview.filled

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewFilledLargeButton() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Large Button",
            size = Button.Size.Large,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFilledLargeButtonStartIcon() {
    AppTheme {
        Button.Filled(
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
fun PreviewFilledLargeButtonEndIcon() {
    AppTheme {
        Button.Filled(
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
fun PreviewFilledLargeButtonStartAndEndIcon() {
    AppTheme {
        Button.Filled(
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
fun PreviewFilledLargeButtonDisabled() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Large Button Disabled",
            size = Button.Size.Large,
            enabled = false
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewFilledLargeButtonDark() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Large Button Dark",
            size = Button.Size.Large,
            enabled = true
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewFilledLargeButtonDisabledDark() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Large Disabled Dark",
            size = Button.Size.Large,
            enabled = false
        )
    }
}