package day06

import readInput

fun main() {

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day06/test_input")
    check(part2(testInput) == 0)

    val input = readInput("day06/input")
    println(part2(input))
}