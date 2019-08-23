package io.github.sofiapl.ast.stmt

import io.github.sofiapl.ast.Stmt

// "package" <name through ".">
data class Package(val name: List<String>): Stmt
