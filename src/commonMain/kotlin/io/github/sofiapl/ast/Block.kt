package io.github.sofiapl.ast

// "{" <stmts through ";" or line break> "}"
data class Block(val stmts: List<Stmt>): Expr, Stmt
