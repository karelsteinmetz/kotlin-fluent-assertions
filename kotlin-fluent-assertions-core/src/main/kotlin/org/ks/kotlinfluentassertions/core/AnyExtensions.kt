package org.ks.kotlinfluentassertions.core


fun Any.should(): ShouldValueHolder {
    return ShouldValueHolder(this)
}