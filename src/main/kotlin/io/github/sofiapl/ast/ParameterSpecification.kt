package io.github.sofiapl.ast

// [<name> "="] <value>
data class ParameterSpecification(
    val name: String?,
    val value: Expr
): Node
