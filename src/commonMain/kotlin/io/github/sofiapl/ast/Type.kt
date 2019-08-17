package io.github.sofiapl.ast

data class Type(
    val name: List<String>,
    val fictiveTypes: List<SpecificationFictiveType>?,
    val nullable: Boolean
): Node
