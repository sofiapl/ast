package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr

interface Value: Expr {

    val bytes: List<Byte>
}
