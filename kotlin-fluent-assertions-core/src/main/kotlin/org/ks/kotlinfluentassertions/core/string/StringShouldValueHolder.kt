package org.ks.kotlinfluentassertions.core.string

import org.ks.kotlinfluentassertions.core.ShouldValueHolder
import kotlin.test.assertEquals

class StringShouldValueHolder(value: String) : ShouldValueHolder<String>(value) {
    public fun beEmptyString() {
        assertEquals("", value)
    }
}