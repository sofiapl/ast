package io.github.sofiapl.ast.expr.value

import java.math.BigDecimal

data class Float(
    override val value: BigDecimal,
    override val bytes: List<Byte>
): Numeric
