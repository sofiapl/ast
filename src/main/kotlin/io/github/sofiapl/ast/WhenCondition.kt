package io.github.sofiapl.ast

import io.github.sofiapl.ast.expr.BinaryOperator
import kotlin.reflect.KClass

sealed class WhenCondition: Node {

    // <condition>
    data class Simple(val condition: Expr): WhenCondition()

    // <operator> <operand>
    data class WithOperand(
        val operator: KClass<BinaryOperator>,
        val operand: Expr
    ): WhenCondition()
}
