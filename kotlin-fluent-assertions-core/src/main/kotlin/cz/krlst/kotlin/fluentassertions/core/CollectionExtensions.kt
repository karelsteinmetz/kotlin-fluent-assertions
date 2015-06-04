package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertNotNull


fun Collection<*>?.should(): CollectionValueHolder<*> {
    assertThatIsNotNullableType(this)
    return CollectionValueHolder(this!!)
}