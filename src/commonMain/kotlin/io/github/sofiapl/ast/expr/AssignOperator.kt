package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

interface AssignOperator: Expr {

    val variable: Expr
    val operand: Expr
}