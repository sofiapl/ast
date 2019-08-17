package io.github.sofiapl.ast

data class DeclarationParameter(
    val name: String?,
    val type: Type?,
    val initialValue: Expr?
): Node
