package io.github.sofiapl.ast

// "@" <type> ["(" <parameters through ","> ")"]
data class Annotation(
    val type: Type,
    val parameters: List<ParameterSpecification>?
): Node
