package com.revolhope.compose_utils.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

inline val ViewModel.scope: CoroutineScope get() = viewModelScope

fun ViewModel.launch(
    context: CoroutineContext = Dispatchers.Default,
    block: suspend CoroutineScope.() -> Unit
) {
    scope.launch(context = context, block = block)
}

fun <T> ViewModel.collect(collector: Flow<T>, block: suspend (T) -> Unit) {
    launch { collector.collect { block(it) } }
}

fun <T> ViewModel.emit(collector: FlowCollector<T>, value: T) {
    launch { collector.emit(value) }
}

fun <T> ViewModel.send(channel: Channel<T>, value: T) {
    launch { channel.send(value) }
}