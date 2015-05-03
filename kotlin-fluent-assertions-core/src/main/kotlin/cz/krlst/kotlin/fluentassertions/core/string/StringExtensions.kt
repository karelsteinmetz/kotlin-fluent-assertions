package cz.krlst.kotlin.fluentassertions.core.string

import cz.krlst.kotlin.fluentassertions.core.string.StringShouldValueHolder
import kotlin.test.assertNotNull


fun String?.should(): StringShouldValueHolder {
    assertNotNull(this)
    return StringShouldValueHolder(this!!)
}