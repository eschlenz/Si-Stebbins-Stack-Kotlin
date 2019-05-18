package com.ericschlenz.sistebbins

class Pile : ArrayList<Card>() {
    fun flipEachCard() = forEach { it.flip() }

    fun upCardCount() = justUpCards().count()

    fun justUpCards() = filter { it.direction == Direction.UP }
}