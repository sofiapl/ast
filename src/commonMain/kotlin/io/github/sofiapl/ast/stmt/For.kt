package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

// "for" ["@" <label>] "(" <variable> "in" <iterable> ")" <body>
data class For(
    val label: String?,
    val variable: String,
    val iterable: Expr,
    val body: Stmt
): Stmt
