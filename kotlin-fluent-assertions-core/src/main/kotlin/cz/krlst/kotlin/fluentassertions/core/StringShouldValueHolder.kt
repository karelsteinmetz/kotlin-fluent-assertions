package cz.krlst.kotlin.fluentassertions.core

import cz.krlst.kotlin.fluentassertions.core.AnyShouldValueHolder
import kotlin.test.assertEquals

class StringShouldValueHolder(value: String) : AnyShouldValueHolder<String>(value) {
    public fun beEmptyString() {
        assertEquals("", value)
    }
}