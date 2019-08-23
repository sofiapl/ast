package io.github.sofiapl.ast.expr.assign

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.AssignOperator

// <variable> "=" <operand>
data class SimpleAssign(
    override val variable: Expr,
    override val operand: Expr
): AssignOperator
