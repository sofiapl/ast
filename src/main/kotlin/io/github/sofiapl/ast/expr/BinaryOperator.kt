package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

interface BinaryOperator: Expr {

    val leftOperand: Expr
    val rightOperand: Expr
}
