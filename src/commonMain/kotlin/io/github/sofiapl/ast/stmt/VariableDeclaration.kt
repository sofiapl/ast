package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

// [<annotations through ";" or line break>]
// [<visibility modifier>] ("val"/"var") <name> [":" <type>] ["=" <initial value>]
data class VariableDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val name: String,
    val type: Type?,
    val initialValue: Expr?,
    val constant: Boolean
): Stmt
