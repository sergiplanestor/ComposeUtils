package com.revolhope.components.basic.buttons.preview.filled

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewFilledSmallButton() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small Button",
            size = Button.Size.Small,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFilledSmallButtonStartIcon() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small + Start Icon",
            size = Button.Size.Small,
            iconStart = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFilledSmallButtonEndIcon() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small + End Icon",
            size = Button.Size.Small,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFilledSmallButtonStartAndEndIcon() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small + Start&End Icon",
            size = Button.Size.Small,
            iconStart = R.drawable.ic_email_outlined_gray,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFilledSmallButtonDisabled() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small Button Disabled",
            size = Button.Size.Small,
            enabled = false
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewFilledSmallButtonDark() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small Button Dark",
            size = Button.Size.Small,
            enabled = true
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewFilledSmallButtonDisabledDark() {
    AppTheme {
        Button.Filled(
            onClick = {},
            text = "Small Disabled Dark",
            size = Button.Size.Small,
            enabled = false
        )
    }
}