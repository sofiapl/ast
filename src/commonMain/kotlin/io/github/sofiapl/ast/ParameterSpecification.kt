package io.github.sofiapl.ast

data class ParameterSpecification(
    val name: String?,
    val value: Expr
): Node
