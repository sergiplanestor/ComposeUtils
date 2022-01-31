package com.revolhope.components.basic.buttons.preview.outlined

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewOutlinedMediumButton() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium Button",
            size = Button.Size.Medium,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedMediumButtonStartIcon() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium + Start Icon",
            size = Button.Size.Medium,
            iconStart = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedMediumButtonEndIcon() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium + End Icon",
            size = Button.Size.Medium,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedMediumButtonStartAndEndIcon() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium + Start&End Icon",
            size = Button.Size.Medium,
            iconStart = R.drawable.ic_email_outlined_gray,
            iconEnd = R.drawable.ic_email_outlined_gray,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewOutlinedMediumButtonDisabled() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium Button Disabled",
            size = Button.Size.Medium,
            enabled = false
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewOutlinedMediumButtonDark() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium Button Dark",
            size = Button.Size.Medium,
            enabled = true
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewOutlinedMediumButtonDisabledDark() {
    AppTheme {
        Button.Outlined(
            onClick = {},
            text = "Medium Disabled Dark",
            size = Button.Size.Medium,
            enabled = false
        )
    }
}