package com.ericschlenz.sistebbins

enum class Suit(private val suit: String) {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    override fun toString(): String = suit
}