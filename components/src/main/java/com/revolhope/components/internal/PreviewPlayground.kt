package com.revolhope.components.internal

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.revolhope.components.basic.topbar.TopBar
import com.revolhope.compose_utils.coroutines.RememberCoroutineScope
import com.revolhope.core.theme.Theme.AppTheme


class PreviewPlayground : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                ActivityContent()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ActivityContent() {
    var scope: Boolean by remember { mutableStateOf(false) }

    RememberCoroutineScope { scope ->
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(title = {
                    TopBar.Content.TitleSubtitle(
                        title = "Playground",
                        subtitle = "What's up"
                    )
                })
            },
            snackbarHost = { SnackbarHost(hostState = SnackbarHostState()) }
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

            }
        }
    }
}

@Preview(device = Devices.PIXEL_3)
@Composable
private fun ActivityLightPreview() {
    AppTheme {
        ActivityContent()
    }
}

@Preview(device = Devices.PIXEL_3, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ActivityDarkPreview() {
    AppTheme {
        ActivityContent()
    }
}