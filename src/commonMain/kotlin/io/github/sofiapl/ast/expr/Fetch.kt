package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

// <name>
data class Fetch(val name: String): Expr
