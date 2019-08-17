package io.github.sofiapl.stmt

import io.github.sofiapl.*

data class FunctionDefine(
    val annotations: List<Annotation>,
    val visibility: VisibilityModifier?,
    val modifiers: List<Modifier>,
    val fictiveTypes: List<FictiveType>?,
    val name: String,
    val parameters: List<DefineParameter>,
    val returnType: Type?,
    val body: List<Stmt>
): Stmt() {

    enum class Modifier {

        NATIVE
    }
}
