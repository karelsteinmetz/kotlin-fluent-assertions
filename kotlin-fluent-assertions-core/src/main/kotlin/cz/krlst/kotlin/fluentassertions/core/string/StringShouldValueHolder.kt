package cz.krlst.kotlin.fluentassertions.core.string

import cz.krlst.kotlin.fluentassertions.core.ShouldValueHolder
import kotlin.test.assertEquals

class StringShouldValueHolder(value: String) : ShouldValueHolder<String>(value) {
    public fun beEmptyString() {
        assertEquals("", value)
    }
}