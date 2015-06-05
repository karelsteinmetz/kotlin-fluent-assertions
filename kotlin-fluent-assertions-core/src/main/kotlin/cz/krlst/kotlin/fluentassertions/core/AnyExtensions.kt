package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertNotNull


fun Any?.should(): AnyShouldValueHolder<Any> {
    assertThatIsNotNullableType(this)
    return AnyShouldValueHolder(this!!)
}