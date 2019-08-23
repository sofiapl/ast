package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt

// "if" ["@" <label>] "(" <condition> ")" <body> ["else" <else body>]
data class If(
    val label: String?,
    val condition: Expr,
    val body: Stmt,
    val elseBody: Stmt?
): Stmt
