package io.github.sofiapl.ast

// <name> ["<" <fictive types through ","> ">"] ["?"]
data class Type(
    val name: List<String>,
    val fictiveTypes: List<FictiveTypeSpecification>?,
    val nullable: Boolean
): Node
