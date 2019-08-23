package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Stmt

// "break" ["@" <label>]
data class Break(val label: String?): Stmt
