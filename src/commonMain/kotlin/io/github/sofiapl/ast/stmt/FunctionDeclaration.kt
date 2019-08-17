package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

data class FunctionDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val modifiers: List<Modifier>,
    val fictiveTypes: List<DeclarationFictiveType>?,
    val name: String,
    val parameters: List<DeclarationParameter>,
    val returnType: Type?,
    val body: List<Stmt>
): Stmt {

    enum class Modifier {

        NATIVE
    }
}
