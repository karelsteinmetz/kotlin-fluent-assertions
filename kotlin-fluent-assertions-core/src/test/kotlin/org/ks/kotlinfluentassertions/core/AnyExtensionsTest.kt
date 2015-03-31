package org.ks.kotlinfluentassertions.core

import org.junit.Test
import kotlin.test.failsWith


public class AnyExtensionsTest {

    Test
    fun shouldBeAssertsThatAreEqual() {
        "value".should().be("value")
    }

    Test
    fun assertsThatIsInstanceOf() {
        "value".should().beInstanceOf<String> { s -> s.should().be("value") }
    }

    Test
    fun returnMessageIsInCorrectFormat() {
        failsWith(javaClass<AssertionError>(), {
            "value".should().be("otherValue")
        }).getMessage()!!
                .should().be(". Expected <otherValue> actual <value>")
    }
}