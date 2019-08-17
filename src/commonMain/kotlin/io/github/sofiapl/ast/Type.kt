package io.github.sofiapl.ast

data class Type(
    val name: List<String>,
    val fictiveTypes: List<FictiveTypeSpecification>?,
    val nullable: Boolean
): Node
