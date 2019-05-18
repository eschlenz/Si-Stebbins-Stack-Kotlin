package com.ericschlenz.sistebbins

enum class Direction(private val direction: String) {
    UP("↑"),
    DOWN("↓");

    override fun toString(): String = direction
}