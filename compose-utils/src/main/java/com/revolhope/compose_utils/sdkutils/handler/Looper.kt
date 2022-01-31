package com.revolhope.compose_utils.sdkutils.handler

import android.os.Looper

val looperUi: Looper by lazy { Looper.getMainLooper() }

val looperCurrentOrNull: Looper? by lazy { Looper.myLooper() }

val looperCurrentOrUi: Looper by lazy { looperCurrentOrNull ?: looperUi }

fun looper(isUiForced: Boolean = false): Looper =
    if (isUiForced) looperUi else looperCurrentOrUi