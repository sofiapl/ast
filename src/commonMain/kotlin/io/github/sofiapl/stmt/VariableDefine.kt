package io.github.sofiapl.stmt

import io.github.sofiapl.Annotation
import io.github.sofiapl.Expr
import io.github.sofiapl.Stmt
import io.github.sofiapl.Type

data class VariableDefine(
    val annotations: List<Annotation>,
    val name: String,
    val type: Type?,
    val initialValue: Expr?,
    val constant: Boolean
): Stmt()
