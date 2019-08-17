package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Stmt

data class Continue(val label: String?): Stmt
