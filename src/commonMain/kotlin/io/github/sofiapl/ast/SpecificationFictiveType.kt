package io.github.sofiapl.ast

data class SpecificationFictiveType(
    val name: String?,
    val restriction: DeclarationFictiveType.Restriction?
): Node
