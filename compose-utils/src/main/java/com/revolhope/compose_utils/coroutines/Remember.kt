package com.revolhope.compose_utils.coroutines

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

@Composable
fun RememberCoroutineScope(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
    block: @Composable (CoroutineScope) -> Unit
) =
    block(rememberCoroutineScope { coroutineContext })

@Composable
infix fun <T> T.byRemember(block: () -> T): T =
    remember { block() }