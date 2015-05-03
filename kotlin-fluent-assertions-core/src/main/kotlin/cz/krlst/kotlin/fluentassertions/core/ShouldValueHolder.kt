package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertEquals


open class ShouldValueHolder<T>(var value: T) {
    public fun be<T>(v: T) {
        assertEquals(v: Any, value)
    }

    public fun beInstanceOf<T>(assertCallback: (v: T) -> Unit) {
        assertCallback(value as T)
    }
}