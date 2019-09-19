package io.github.sofiapl.ast.expr.value

import java.math.BigInteger

data class Integer(
    override val value: BigInteger,
    override val bytes: List<Byte>
): Numeric
