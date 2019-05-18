package com.ericschlenz.sistebbins

import com.ericschlenz.sistebbins.Output.Companion.explain
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.int
import java.util.*

class Main : CliktCommand() {
    private val random = Random()
    private val drawCount: Int by option(help = "Number of cards to draw, flip, and return to deck").int()
        .default(random.nextInt(52 + 1))

    override fun run() {
        println("\n==== Si Stebbins Stack ====\n")

        explain("$drawCount is the draw count.")

        val result = SiStebbinsStack(random).play(drawCount)

        println("""
            *********************************
            *********************************
            Summary:

            We drew $drawCount card(s) from a shuffled deck. We flipped each of the drawn cards over, and then returned
            them to the deck. We then shuffled the deck again. We then drew $drawCount card(s) again, and flipped each
            of those over.

            This left us with two piles of cards. And no matter what, because of the Si Stebbins effect, both piles
            will always have the same number of cards facing up!

            == Pile A ==
                Up Card Count: ${result.first.upCardCount()}
                Up Cards: ${result.first.justUpCards()}
                All Cards: ${result.first}

            == Pile B ==
                Up Card Count: ${result.second.upCardCount()}
                Up Cards: ${result.second.justUpCards()}
                All Cards: ${result.second}

            *********************************
            *********************************
        """.trimIndent())
    }
}

fun main(args: Array<String>) = Main().main(args)