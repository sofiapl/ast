package io.github.sofiapl.ast.expr.comparison

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

// <left operand> "<" <right operand>
data class Lower(
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator
