package day07

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day07/test_input")
    check(part1(testInput) == 0)

    val input = readInput("day07/input")
    println(part1(input))
}