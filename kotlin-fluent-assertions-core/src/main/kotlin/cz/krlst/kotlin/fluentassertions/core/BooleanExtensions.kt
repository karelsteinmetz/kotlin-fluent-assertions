package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertNotNull

fun Boolean?.should(): BooleanShouldValueHolder {
    assertThatIsNotNullableType(this)
    return BooleanShouldValueHolder(this!!)
}