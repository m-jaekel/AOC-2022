package day09

import readInput

fun main() {
    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day09/test_input")
    check(part2(testInput) == 0)

    val input = readInput("day09/input")
    println(part2(input))
}