package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.*

// "function" "(" <parameters through ","> ")" [":" <return type>]
// ("=" <body>/"{" <body> "}")
data class FunctionDeclaration(
    val parameters: List<ParameterDeclaration>,
    val returnType: Type?,
    val body: Expr
): Expr
