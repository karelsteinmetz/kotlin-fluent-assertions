package cz.krlst.kotlin.fluentassertions.core

import kotlin.test.assertNotNull

fun Boolean?.should(): BooleanShouldValueHolder {
    assertNotNull(this)
    return BooleanShouldValueHolder(this!!)
}