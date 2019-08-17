package io.github.sofiapl

data class FictiveType(
    val name: String,
    val upperBound: Type?,
    val restriction: Restriction?
) {

    enum class Restriction {

        IN, OUT
    }
}
