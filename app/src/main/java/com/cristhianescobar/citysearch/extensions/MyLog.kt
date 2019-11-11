package com.cristhianescobar.citysearch.extensions

import android.util.Log

fun String.log(tag: String = "cje466") {
    Log.d(tag, this)
}

fun String.logError(tag: String = "cje466") {
    Log.e(tag, this)
}