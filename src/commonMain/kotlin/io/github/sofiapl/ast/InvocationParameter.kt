package io.github.sofiapl.ast

data class InvocationParameter(
    val name: String?,
    val value: Expr
): Node
