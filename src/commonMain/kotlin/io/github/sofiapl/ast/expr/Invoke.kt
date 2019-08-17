package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.InvocationParameter
import io.github.sofiapl.ast.SpecificationFictiveType

data class Invoke(
    val expr: Expr,
    val fictiveTypes: List<SpecificationFictiveType>?,
    val parameters: List<InvocationParameter>
): Expr
