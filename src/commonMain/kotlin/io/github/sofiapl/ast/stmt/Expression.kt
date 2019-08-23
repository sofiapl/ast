package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

// <expr>
data class Expression(val expr: Expr): Stmt
