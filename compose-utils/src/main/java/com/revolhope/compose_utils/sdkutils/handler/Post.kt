package com.revolhope.compose_utils.sdkutils.handler

import android.os.Handler

fun handler(isOnUi: Boolean): Handler =
    Handler(looper(isOnUi))

fun withHandler(isOnUi: Boolean, block: Handler.() -> Unit) =
    handler(isOnUi).run(block)

fun post(
    delay: Long = Long.MIN_VALUE,
    isOnMainThread: Boolean = true,
    block: () -> Unit
) {
    withHandler(isOnMainThread) {
        if (delay > 0) {
            postDelayed({ block() }, delay)
        } else {
            post { block() }
        }
    }
}