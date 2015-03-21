package org.ks.kotlinfluentassertions.core

import org.junit.Test


public class AnyExtensionsTest {

    Test
    fun shouldBeAssertsThatAreEqual() {
        "value".should().be("value")
    }
}