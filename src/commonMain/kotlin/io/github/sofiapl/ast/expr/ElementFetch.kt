package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

data class ElementFetch(
    val expr: Expr,
    val key: Expr
): Expr