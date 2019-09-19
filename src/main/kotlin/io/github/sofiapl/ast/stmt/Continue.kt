package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Stmt

// "continue" ["@" <label>]
data class Continue(val label: String?): Stmt
