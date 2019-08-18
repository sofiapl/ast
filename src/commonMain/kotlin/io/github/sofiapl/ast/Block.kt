package io.github.sofiapl.ast

data class Block(val stmts: List<Stmt>): Expr, Stmt
