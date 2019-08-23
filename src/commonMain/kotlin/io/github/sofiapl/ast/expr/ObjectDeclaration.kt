package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.*

// "object" ":" [<superclass>] ["," <interfaces through ",">]
data class ObjectDeclaration(
    val superclass: Type?,
    val interfaces: List<Type>
): Expr
