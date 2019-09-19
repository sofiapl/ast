package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

// <expr> "." <name>
data class MemberFetch(
    val expr: Expr,
    val name: String
): Expr
