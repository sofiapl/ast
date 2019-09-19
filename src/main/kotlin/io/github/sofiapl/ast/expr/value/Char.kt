package io.github.sofiapl.ast.expr.value

import io.github.sofiapl.ast.expr.Value

data class Char(override val bytes: List<Byte>): Value
