package com.revolhope.components.basic.buttons.preview.flat

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.R
import com.revolhope.components.basic.buttons.Button
import com.revolhope.core.theme.Theme.AppTheme

@Preview
@Composable
fun PreviewFlatMediumButton() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Medium Button",
            size = Button.Size.Medium,
            enabled = true
        )
    }
}

@Preview
@Composable
fun PreviewFlatMediumButtonStartIcon() {
    AppTheme {
        Button.Flat(
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
fun PreviewFlatMediumButtonEndIcon() {
    AppTheme {
        Button.Flat(
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
fun PreviewFlatMediumButtonStartAndEndIcon() {
    AppTheme {
        Button.Flat(
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
fun PreviewFlatMediumButtonDisabled() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Medium Button Disabled",
            size = Button.Size.Medium,
            enabled = false
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewFlatMediumButtonDark() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Medium Button Dark",
            size = Button.Size.Medium,
            enabled = true
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewFlatMediumButtonDisabledDark() {
    AppTheme {
        Button.Flat(
            onClick = {},
            text = "Medium Disabled Dark",
            size = Button.Size.Medium,
            enabled = false
        )
    }
}