package org.ks.kotlinfluentassertions.core.boolean

import kotlin.test.assertNotNull

fun Boolean?.should(): BooleanShouldValueHolder {
    assertNotNull(this)
    return BooleanShouldValueHolder(this!!)
}