package cz.krlst.kotlin.fluentassertions.core

import org.junit.Test

public class BooleanExtensionTest {

    Test
    fun assertsThatIsTrue() {
        true.should().beTruthy()
    }

    Test
    fun assertsThatIsFalse() {
        false.should().beFalsy()
    }
}