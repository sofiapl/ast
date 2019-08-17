package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.ParameterSpecification
import io.github.sofiapl.ast.FictiveTypeSpecification

data class Invoke(
    val expr: Expr,
    val fictiveTypes: List<FictiveTypeSpecification>?,
    val parameters: List<ParameterSpecification>
): Expr
