package org.ks.kotlinfluentassertions.core

import kotlin.test.assertEquals


class ShouldValueHolder(var value: Any) {
    public fun be<T>(v: T) {
        assertEquals(value, v)
    }
}