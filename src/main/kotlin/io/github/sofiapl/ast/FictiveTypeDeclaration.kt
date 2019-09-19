package io.github.sofiapl.ast

// [("in"/"out")] <name> [":" <upper bound>]
data class FictiveTypeDeclaration(
    val name: String,
    val upperBound: Type?,
    val restriction: Restriction?
): Node {

    enum class Restriction {

        IN, OUT
    }
}
