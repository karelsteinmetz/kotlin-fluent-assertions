package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue


open class ShouldValueHolder<T>(var value: T) {
    public fun be<T>(expectedValue: T) {
        assertEquals(expectedValue, value)
    }

    public fun beInstanceOf<T>(assertCallback: (v: T) -> Unit) {
        val genericValue = value as T
        assertThatIsNotUnexpectedType(value)
        assertCallback(genericValue)
    }
}