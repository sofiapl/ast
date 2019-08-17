package io.github.sofiapl.ast.expr.binary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

data class Multiply(
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator
