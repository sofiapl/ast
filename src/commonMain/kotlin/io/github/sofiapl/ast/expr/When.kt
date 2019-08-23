package io.github.sofiapl.ast.expr

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.WhenCondition

// "when" ["@" <label>] ["(" <operand> ")"] "{" [<when condition> "->" <expr>] [...] ["else" "->" <expr>] "}"
data class When(
    val label: String?,
    val operand: Expr?,
    val body: Map<WhenCondition?, Expr>
): Expr
