package com.ericschlenz.sistebbins

class Card(
    private val value: Value,
    private val suit: Suit
) {
    var direction: Direction = Direction.DOWN

    fun flip() {
        direction = when (direction) {
            Direction.UP -> Direction.DOWN
            Direction.DOWN -> Direction.UP
        }
    }

    override fun toString(): String = "$value$suit$direction"
}