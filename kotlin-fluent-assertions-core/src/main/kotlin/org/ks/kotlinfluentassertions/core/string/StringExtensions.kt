package org.ks.kotlinfluentassertions.core.string

import org.ks.kotlinfluentassertions.core.string.StringShouldValueHolder
import kotlin.test.assertNotNull


fun String?.should(): StringShouldValueHolder {
    assertNotNull(this)
    return StringShouldValueHolder(this!!)
}