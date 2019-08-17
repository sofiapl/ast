package io.github.sofiapl.ast.expr.binary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.BinaryOperator

data class LogicalAnd(
    override val leftOperand: Expr,
    override val rightOperand: Expr
): BinaryOperator
