package org.ks.kotlinfluentassertions.core

import kotlin.test.assertNotNull

fun Boolean?.should(): BooleanShouldValueHolder {
    assertNotNull(this)
    return BooleanShouldValueHolder(this!!)
}