package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

// [<annotations through ";" or line break>]
// [<visibility modifier>] <modifiers>
// "function" ["<" <fictive types through ","> ">"]
// <name> "(" <parameters through ","> ")" [":" <return type>]
// ("=" <body>/"{" <body> "}")
data class FunctionDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val modifiers: List<Modifier>,
    val fictiveTypes: List<FictiveTypeDeclaration>?,
    val name: String,
    val parameters: List<ParameterDeclaration>,
    val returnType: Type?,
    val body: Expr
): Stmt {

    enum class Modifier {

        // "native"
        NATIVE
    }
}
