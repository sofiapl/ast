package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

// <annotations through ";" or line break>
// [<visibility modifier>] <kind> ["<" <fictive types through ","> ">"]
// <name> ["(" <parameters through ","> ")"]
// ":" [<superclass>] ["," <interfaces through ",">]
data class ClassDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val kind: Kind,
    val fictiveTypes: List<FictiveTypeDeclaration>?,
    val name: String,
    val parameters: List<ParameterDeclaration>?,
    val superclass: Type?,
    val interfaces: List<Type>
): Stmt {

    enum class Kind {

        // "class"
        CLASS,

        // "interface"
        INTERFACE,

        // "annotation"
        ANNOTATION,

        // "data class"
        DATA_CLASS,

        // "sealed class"
        SEALED_CLASS,

        // "inner class"
        INNER_CLASS
    }
}
