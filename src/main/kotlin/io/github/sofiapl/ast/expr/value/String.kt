package io.github.sofiapl.ast.expr.value

import io.github.sofiapl.ast.expr.Value

data class String(override val bytes: List<Byte>): Value
