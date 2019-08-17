package io.github.sofiapl.stmt

import io.github.sofiapl.*

data class VariableDefine(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val name: String,
    val type: Type?,
    val initialValue: Expr?,
    val constant: Boolean
): Stmt()
