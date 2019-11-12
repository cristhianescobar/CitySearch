package com.cristhianescobar.citysearch.extensions

import android.os.SystemClock
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Basic debounce helper object
 */
object Debounce {

    private var lastTimeMs: Long = 0L
    /**
     * Reject input if fired within the cool down period for call
     */
    fun CoroutineScope.debounce(
        coolDownMs: Long = 500,
        block: suspend CoroutineScope.() -> Unit
    ): Job? {
        if (SystemClock.uptimeMillis() <= lastTimeMs + coolDownMs) {
            return null
        }
        lastTimeMs = SystemClock.uptimeMillis()
        return launch(block = block)
    }
}