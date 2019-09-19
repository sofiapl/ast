package io.github.sofiapl.ast.expr.binary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

// <left operand> <name> <right operand>
data class Custom(
    val name: String,
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator
