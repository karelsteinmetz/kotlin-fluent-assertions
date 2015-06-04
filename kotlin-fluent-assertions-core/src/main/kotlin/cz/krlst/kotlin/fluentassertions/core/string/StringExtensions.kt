package cz.krlst.kotlin.fluentassertions.core.string

import cz.krlst.kotlin.fluentassertions.core.assertThatIsNotNullableType


fun String?.should(): StringShouldValueHolder {
    assertThatIsNotNullableType(this)
    return StringShouldValueHolder(this!!)
}