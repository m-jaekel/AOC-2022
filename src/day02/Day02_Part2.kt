package day02

import readInput

fun main() {

    /**
     * X -> lose
     * Y -> draw
     * Z -> win
     */

    fun part2(input: List<String>): Int {
        var score = 0
        input.forEach {
            val shapes: List<String> = it.chunked(1)
            val round = playRound(shapes[0], shapes[2])
            score += round.second + getShapeScore(round.first)
        }

        return score
    }

    val testInput = readInput("day02/test_input")
    check(part2(testInput) == 12)

    val input = readInput("day02/input")
    println(part2(input))
}

private fun playRound(opponent: String, condition: String): Pair<String, Int> = when {
    opponent == "A" && condition == "Y" -> Pair("A", 3)
    opponent == "A" && condition == "X" -> Pair("C", 0)
    opponent == "A" && condition == "Z" -> Pair("B", 6)
    opponent == "B" && condition == "X" -> Pair("A", 0)
    opponent == "B" && condition == "Y" -> Pair("B", 3)
    opponent == "B" && condition == "Z" -> Pair("C", 6)
    opponent == "C" && condition == "X" -> Pair("B", 0)
    opponent == "C" && condition == "Z" -> Pair("A", 6)
    opponent == "C" && condition == "Y" -> Pair("C", 3)
    else -> throw Exception("invalid")
}

private fun getShapeScore(shape: String): Int = when (shape) {
    "A" -> 1
    "B" -> 2
    else -> 3
}
