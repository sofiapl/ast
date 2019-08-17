package io.github.sofiapl.ast.expr.comparison

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

data class Equals(
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator