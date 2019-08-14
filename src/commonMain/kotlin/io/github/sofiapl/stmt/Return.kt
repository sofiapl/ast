package io.github.sofiapl.stmt

import io.github.sofiapl.Expr
import io.github.sofiapl.Stmt

data class Return(
    val label: String?,
    val expr: Expr?
): Stmt()
