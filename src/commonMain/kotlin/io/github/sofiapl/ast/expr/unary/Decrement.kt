package io.github.sofiapl.ast.expr.unary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.UnaryOperator

data class Decrement(
    override val operand: Expr,
    val post: Boolean
): UnaryOperator