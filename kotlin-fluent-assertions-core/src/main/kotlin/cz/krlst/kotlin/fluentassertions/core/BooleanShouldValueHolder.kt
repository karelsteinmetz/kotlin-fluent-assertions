package cz.krlst.kotlin.fluentassertions.core

import cz.krlst.kotlin.fluentassertions.core.AnyShouldValueHolder
import java.lang
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BooleanShouldValueHolder(value: Boolean) : AnyShouldValueHolder<Boolean>(value) {
    
    public fun beTruthy() {
        assertTrue(value)
    }
    
    public fun beFalsy() {
        assertFalse(value)
    }
}