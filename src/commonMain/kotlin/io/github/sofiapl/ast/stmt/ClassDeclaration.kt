package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.*

data class ClassDeclaration(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val kind: Kind,
    val fictiveTypes: List<DeclarationFictiveType>?,
    val name: String,
    val parameters: List<DeclarationParameter>?,
    val superClass: Type?,
    val interfaces: List<Type>
): Stmt {

    enum class Kind {

        CLASS, INTERFACE, ANNOTATION, DATA_CLASS, SEALED_CLASS, INNER_CLASS
    }
}
