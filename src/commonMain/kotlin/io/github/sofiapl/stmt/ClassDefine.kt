package io.github.sofiapl.stmt

import io.github.sofiapl.*

data class ClassDefine(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val kind: Kind,
    val fictiveTypes: List<FictiveType>?,
    val name: String,
    val parameters: List<DefineParameter>?,
    val superClass: Type?,
    val interfaces: List<Type>
): Stmt() {

    enum class Kind {

        CLASS, INTERFACE, ANNOTATION, DATA_CLASS, SEALED_CLASS, INNER_CLASS
    }
}
