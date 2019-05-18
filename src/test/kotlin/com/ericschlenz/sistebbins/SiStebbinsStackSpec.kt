package com.ericschlenz.sistebbins

import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*
import kotlin.test.Test
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class SiStebbinsStackSpec(private val drawCount: Int) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun drawCount() = (0..52).toList()
    }

    private val stubRandom = Random(9999 /* Seed */)

    @Test
    fun `Given a draw count, When play, Then count of up cards in each pile should match`() {
        val stack = SiStebbinsStack(stubRandom)
        val pair = stack.play(drawCount = drawCount)

        println("""
            ---------------------------------------
            Test: drawCount = $drawCount
            ${pileSummary("A", pair.first)}
            ${pileSummary("B", pair.second)}

            Up card count: Pile A=${pair.first.upCardCount()}, Pile B=${pair.second.upCardCount()}
            ---------------------------------------
        """.trimIndent())
        println()

        assertEquals(pair.first.upCardCount(), pair.second.upCardCount())
    }

    private fun pileSummary(whichPile: String, pile: Pile): String {
        return """
            Pile $whichPile ->
              Up Cards: ${pile.justUpCards()}
              All Cards: $pile"""
    }
}