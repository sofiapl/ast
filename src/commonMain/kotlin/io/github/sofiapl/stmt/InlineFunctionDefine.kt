package io.github.sofiapl.stmt

import io.github.sofiapl.*

data class InlineFunctionDefine(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val modifiers: List<FunctionDefine.Modifier>,
    val fictiveTypes: List<FictiveType>?,
    val name: String,
    val parameters: List<DefineParameter>,
    val returnType: Type?,
    val expr: Expr
): Stmt()
