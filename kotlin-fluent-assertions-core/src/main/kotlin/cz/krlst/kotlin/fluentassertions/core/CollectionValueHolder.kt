package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class CollectionValueHolder<T>(value: Collection<T>) : AnyShouldValueHolder<Collection<T>>(value) {

    fun beEmpty() {
        assertEquals(0, value.count(), "Current count of values is ${value.count()} but should be 0")
    }

    fun beEquivalentTo(expectedValues: Iterable<T>) {
        assertEquals(expectedValues.count(), value.count(),
                """Current count of values is ${value.count()} and expected count of values is ${expectedValues.count()}.
                Values in current collection are $value and expected values are $expectedValues.""")
        expectedValues.forEachIndexed { i, ex ->
            ex.should().be(value.elementAt(i))
        }
    }


}