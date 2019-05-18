package com.ericschlenz.sistebbins

import com.ericschlenz.sistebbins.Output.Companion.explain
import java.util.*

class SiStebbinsStack(private val random: Random) {
    private val deck = Deck()

    fun play(drawCount: Int): Pair<Pile, Pile> {
        deck.shuffle(random)
        explain("Shuffling the deck...\nDeck of Cards: $deck")

        val drawPile = deck.drawCards(drawCount)
        explain("Drawing $drawCount card(s)...\nDrawn Cards: $drawPile\n\nDeck of Cards: $deck")

        drawPile.flipEachCard()
        explain("Flipping the $drawCount card(s) drawn...\nDrawn Cards Flipped: $drawPile\n\nDeck of Cards: $deck")

        deck.recombineWith(drawPile)
        explain("Recombining drawn cards with the deck...\nDeck of Cards: $deck")

        deck.shuffle(random)
        explain("Shuffling the deck again...\nDeck of Cards: $deck")

        val flipPile = deck.drawCards(drawCount)
        explain("Drawing $drawCount card(s) again...\nDrawn Cards: $flipPile\n\nDeck of Cards: $deck")

        flipPile.flipEachCard()
        explain("Flipping each drawn card...\nDrawn Cards Flipped: $flipPile\n\nDeck of Cards: $deck")

        return Pair(flipPile, deck.toPile())
    }
}