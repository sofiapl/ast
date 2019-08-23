package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.FictiveTypeSpecification
import io.github.sofiapl.ast.ParameterSpecification

// <expr> ["<" <fictive types through ","> ">"] "(" <parameters through ","> ")"
data class Invoke(
    val expr: Expr,
    val fictiveTypes: List<FictiveTypeSpecification>?,
    val parameters: List<ParameterSpecification>
): Expr
