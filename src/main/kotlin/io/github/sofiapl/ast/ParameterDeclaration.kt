package io.github.sofiapl.ast

// (<name> [":" <type>] ["=" <initial value>]/[<name>] [":" <type>])
data class ParameterDeclaration(
    val name: String?,
    val type: Type?,
    val initialValue: Expr?
): Node
