package day06

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        input.first().forEachIndexed { index, _ ->
            if (input.first().subSequence(index, index + 4).toSet().size == 4) return index + 4
        }
        return 0
    }

    val testInput = readInput("day06/test_input")
    check(part1(testInput) == 11)

    val input = readInput("day06/input")
    println(part1(input))
}