package cz.krlst.kotlin.fluentassertions.core

import cz.krlst.kotlin.fluentassertions.core.string.should
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import kotlin.test.assertTrue
import kotlin.test.failsWith


RunWith(Enclosed::class)
public class CollectionValueHolderTest {

    public class beEmpty() {
        Test
        fun assertsThatCollectionIsEmpty() {
            listOf<Any>()
                    .should().beEmpty<Any>()
        }

        Test
        fun returnsMessageWhenCollectionIsNotEmpty() {
            val e = failsWith(javaClass<AssertionError>(), {
                listOf(listOf("ASingleValue"))
                        .should().beEmpty<String>()
            })

            assertTrue(e.getMessage()!!.contains("Current count of values is 1 but should be 0."))
        }
    }

    public class beEquivalentTo() {
        Test
        fun assertsThatCollectionsIsEqual() {
            listOf("FirstValue", "SecondValue")
                    .should().beEquivalentTo<String>(listOf("FirstValue", "SecondValue"))
        }

        Test
        fun returnsMessageAboutCountWhenCollectionsAreNotEqual() {
            val e = failsWith(javaClass<AssertionError>(), {
                listOf("FirstValue")
                        .should().beEquivalentTo<String>(listOf("FirstValue", "SecondValue"))
            })

            assertTrue(e.getMessage()!!.contains("Current count of values is 1 and expected count of values is 2"))
        }

        Test
        fun returnsMessageAboutValuesWhenCollectionsAreNotEqual() {
            val e = failsWith(javaClass<AssertionError>(), {
                listOf("FirstValue")
                        .should().beEquivalentTo<String>(listOf("FirstValue", "SecondValue"))
            })

            assertTrue(e.getMessage()!!.contains("Values in current collection are [FirstValue] and expected values are [FirstValue, SecondValue]."))
        }
    }
}