package io.github.sofiapl.ast.expr.assign

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.AssignOperator

data class ShiftLeftAssign(
    override val variable: Expr,
    override val operand: Expr
): AssignOperator
