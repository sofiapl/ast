package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Stmt

// "import" <name through ".">
data class Import(val name: List<String>): Stmt
