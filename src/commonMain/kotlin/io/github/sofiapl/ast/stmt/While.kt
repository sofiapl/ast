package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

data class While(
    val label: String?,
    val condition: Expr,
    val body: Stmt
): Stmt
