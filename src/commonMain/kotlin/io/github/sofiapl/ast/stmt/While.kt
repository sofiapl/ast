package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

// "while" ["@" <label>] "(" <condition> ")" <body>
data class While(
    val label: String?,
    val condition: Expr,
    val body: Stmt
): Stmt
