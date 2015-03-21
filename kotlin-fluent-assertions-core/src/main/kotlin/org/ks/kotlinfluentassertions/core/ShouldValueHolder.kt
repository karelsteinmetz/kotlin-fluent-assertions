package org.ks.kotlinfluentassertions.core

import org.junit.Assert.assertThat
import org.hamcrest.CoreMatchers.equalTo

class ShouldValueHolder(var value: Any) {
    public fun be<T>(v: T) {
        assertThat(value, equalTo(v: Any))
    }
}