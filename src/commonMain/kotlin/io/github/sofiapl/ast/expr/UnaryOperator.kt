package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

interface UnaryOperator: Expr {

    val operand: Expr
}