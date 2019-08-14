package io.github.sofiapl.stmt

import io.github.sofiapl.Annotation
import io.github.sofiapl.FunctionParameter
import io.github.sofiapl.Stmt
import io.github.sofiapl.Type

data class FunctionDefine(
    val annotations: List<Annotation>,
    val name: String,
    val parameters: List<FunctionParameter>,
    val returnType: Type?,
    val body: List<Stmt>
): Stmt()
