package io.github.sofiapl.ast

data class ParameterDeclaration(
    val name: String?,
    val type: Type?,
    val initialValue: Expr?
): Node
