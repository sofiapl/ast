package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

// "if" ["@" <label>] "(" <condition> ")" <body> ["else" <else body>]
data class If(
    val label: String?,
    val condition: Expr,
    val body: Expr,
    val elseBody: Expr?
): Expr
