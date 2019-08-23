package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Expr
import io.github.sofiapl.ast.Stmt
import io.github.sofiapl.ast.WhenCondition

// "when" ["@" <label>] ["(" <operand> ")"] "{" [<when condition> "->" <stmt>] [...] ["else" "->" <stmt>] "}"
data class When(
    val label: String?,
    val operand: Expr?,
    val body: Map<WhenCondition?, Stmt>
): Stmt
