package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertNotNull


public fun <T : Any> assertThatIsNotNullableType(actual: T?) {
    assertNotNull(actual, "Assertions for Nullable types are not supported but you can passed it because !! will be ugly in your tests.")
}

public fun <T : Any> assertThatIsNotUnexpectedType(actual: T?) {
    assertNotNull(actual, "Unexpected type of value.")
}