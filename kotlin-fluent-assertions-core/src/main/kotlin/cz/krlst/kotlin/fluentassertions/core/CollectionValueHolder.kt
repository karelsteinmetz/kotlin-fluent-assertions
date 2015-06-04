package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class CollectionValueHolder<T>(value: Collection<T>) : ShouldValueHolder<Collection<T>>(value) {

    fun <T> beEmpty() {
        val values = value as Iterable<T>
        assertThatIsNotUnexpectedType(value)
        assertEquals(0, values.count(), "Current count of values is ${values.count()} but should be 0")
    }

    fun <T> beEquivalentTo(expectedValues: Iterable<T>) {
        val values = value as Iterable<T>
        assertThatIsNotUnexpectedType(value)
        assertEquals(expectedValues.count(), values.count(),
                """Current count of values is ${values.count()} and expected count of values is ${expectedValues.count()}.
                Values in current collection are $value and expected values are $expectedValues.""")
        expectedValues.forEachIndexed { i, ex ->
            ex.should().be(values.elementAt(i))
        }
    }


}