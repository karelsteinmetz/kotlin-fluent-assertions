package com.kotlinfluentassertions.core


fun Any.should(): ShouldValueHolder {
    return ShouldValueHolder(this)
}