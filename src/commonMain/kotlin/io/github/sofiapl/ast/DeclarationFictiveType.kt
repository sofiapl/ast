package io.github.sofiapl.ast

data class DeclarationFictiveType(
    val name: String,
    val upperBound: Type?,
    val restriction: Restriction?
): Node {

    enum class Restriction {

        IN, OUT
    }
}
