package io.github.sofiapl.ast

// [[("in"/"out")] <name>]
data class FictiveTypeSpecification(
    val name: String?,
    val restriction: FictiveTypeDeclaration.Restriction?
): Node
