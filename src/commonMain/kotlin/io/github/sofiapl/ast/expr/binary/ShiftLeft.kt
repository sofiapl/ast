package io.github.sofiapl.ast.expr.binary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

data class ShiftLeft(
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator
