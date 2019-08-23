package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

// <annotations through ";" or line break>
// [<visibility modifier>] "object" <name>
// ":" [<superclass>] ["," <interfaces through ",">]
data class ObjectDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val name: String,
    val superclass: Type?,
    val interfaces: List<Type>
): Stmt
