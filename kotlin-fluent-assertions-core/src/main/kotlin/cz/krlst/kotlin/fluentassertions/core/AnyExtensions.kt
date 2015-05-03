package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertNotNull


fun Any?.should(): ShouldValueHolder<Any> {
    assertNotNull(this)
    return ShouldValueHolder(this!!)
}