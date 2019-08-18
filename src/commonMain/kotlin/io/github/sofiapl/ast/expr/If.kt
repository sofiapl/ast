package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

data class If(
    val label: String?,
    val condition: Expr,
    val body: Expr,
    val elseBody: Expr?
): Expr
