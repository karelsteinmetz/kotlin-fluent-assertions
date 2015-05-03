package cz.krlst.kotlin.fluentassertions.core

import org.junit.Test
import kotlin.test.failsWith


public class AnyExtensionsTest {

    Test
    fun shouldBeAssertsThatAreEqual() {
        val testFixture = TestFixture("AValue")

        testFixture.should().be(testFixture)
    }

    Test
    fun assertsThatIsInstanceOf() {
        val testFixture = TestFixture("AValue")

        testFixture.should().beInstanceOf<TestFixture> {
            s ->
            s.property.should().be("AValue")
        }
    }

    Test
    fun returnMessageIsInCorrectFormat() {
        failsWith(javaClass<AssertionError>(), {
            TestFixture("AValue").should().be(TestFixture("AnOtherValue"))
        }).getMessage()!!
                .should().be(". Expected <TestFixture(property=AnOtherValue)> actual <TestFixture(property=AValue)>")
    }

    data class TestFixture(var property: String) {
    }
}