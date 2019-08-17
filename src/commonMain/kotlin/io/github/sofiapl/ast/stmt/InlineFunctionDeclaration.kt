package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

data class InlineFunctionDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val modifiers: List<FunctionDeclaration.Modifier>,
    val fictiveTypes: List<FictiveTypeDeclaration>?,
    val name: String,
    val parameters: List<ParameterDeclaration>,
    val returnType: Type?,
    val expr: Expr
): Stmt
