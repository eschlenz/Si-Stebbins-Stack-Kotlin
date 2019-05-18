package com.ericschlenz.sistebbins

class Deck : ArrayList<Card>() {
    init {
        Suit.values().forEach { suit ->
            Value.values().forEach {
                value -> add(Card(value = value, suit = suit))
            }
        }
    }

    fun drawCards(drawCount: Int): Pile {
        val pile = Pile()

        (1..drawCount).forEach { pile.add(get(it - 1)) }

        removeAll(pile)

        return pile
    }

    fun recombineWith(pile: Pile) = addAll(pile)

    fun toPile(): Pile = Pile().apply { addAll(this@Deck) }
}