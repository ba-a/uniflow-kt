/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed launchOn an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.uniflow.core.logger

import io.uniflow.core.flow.data.UIEvent
import io.uniflow.core.flow.data.UIState
import io.uniflow.core.logger.UniFlowLogger.TAG

/**
 * Simple Message Logger
 *
 * @author Arnaud Giuliani
 */
open class SimpleMessageLogger(val tag: String = TAG, debugThread: Boolean = false) : Logger {

    val dbg_th: String = if (debugThread) "[${Thread.currentThread().name}]" else ""

    override fun log(message: String) {
        println("$tag$dbg_th - $message")
    }

    override fun logState(state: UIState) {
        println("$tag$dbg_th [STATE] - $state")
    }

    override fun logEvent(event: UIEvent) {
        println("$tag$dbg_th <EVENT> - $event")
    }

    override fun logError(errorMessage: String, error: Exception?) {
        val finalError = error?.let { ":: $error" } ?: ""
        System.err.println("$tag$dbg_th !ERROR! - $errorMessage $finalError")
    }
}