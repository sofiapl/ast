package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

data class For(
    val label: String?,
    val variable: String,
    val iterable: Expr,
    val body: Stmt
): Stmt
