package cz.krlst.kotlin.fluentassertions.core

import cz.krlst.kotlin.fluentassertions.core.assertThatIsNotNullableType


fun String?.should(): StringShouldValueHolder {
    assertThatIsNotNullableType(this)
    return StringShouldValueHolder(this!!)
}