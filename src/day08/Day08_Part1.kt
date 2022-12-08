package day08

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day08/test_input")
    check(part1(testInput) == 21)

    val input = readInput("day08/input")
    println(part1(input))
}