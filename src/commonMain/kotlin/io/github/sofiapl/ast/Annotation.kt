package io.github.sofiapl.ast

data class Annotation(
    val type: Type,
    val parameters: List<InvocationParameter>
): Node
