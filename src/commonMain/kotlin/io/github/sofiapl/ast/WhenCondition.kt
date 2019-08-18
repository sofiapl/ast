package io.github.sofiapl.ast

import io.github.sofiapl.ast.expr.BinaryOperator
import kotlin.reflect.KClass

sealed class WhenCondition: Node {

    data class Simple(val condition: Expr): WhenCondition()

    data class WithOperand(
        val operator: KClass<BinaryOperator>,
        val operand: Expr
    ): WhenCondition()
}
