package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

data class Return(
    val label: String?,
    val expr: Expr?
): Stmt
