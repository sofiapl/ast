package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Stmt

data class Import(val name: List<String>): Stmt
