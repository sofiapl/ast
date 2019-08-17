package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.InvocationParameter

data class Invoke(
    val expr: Expr,
    val parameters: List<InvocationParameter>
): Expr