package io.github.sofiapl.ast.expr.binary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

// <left operand> ">>" <right operand>
data class ShiftRight(
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator
