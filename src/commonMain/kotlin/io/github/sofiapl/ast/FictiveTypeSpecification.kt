package io.github.sofiapl.ast

data class FictiveTypeSpecification(
    val name: String?,
    val restriction: FictiveTypeDeclaration.Restriction?
): Node
