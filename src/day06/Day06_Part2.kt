package day06

import readInput

fun main() {
    fun part2(input: List<String>): Int {
        input.first().forEachIndexed { index, _ ->
            if (input.first().subSequence(index, index + 14).toSet().size == 14) return index + 14
        }
        return 0
    }

    val testInput = readInput("day06/test_input")
    check(part2(testInput) == 26)

    val input = readInput("day06/input")
    println(part2(input))
}