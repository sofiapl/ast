package io.github.sofiapl.ast

data class Type(
    val name: List<String>,
    val nullable: Boolean
): Node
