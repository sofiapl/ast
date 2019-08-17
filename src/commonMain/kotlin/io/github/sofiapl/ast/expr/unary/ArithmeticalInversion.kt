package io.github.sofiapl.ast.expr.unary

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.expr.UnaryOperator

data class ArithmeticalInversion(override val operand: Expr): UnaryOperator