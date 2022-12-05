package day06

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day06/test_input")
    check(part1(testInput) == 0)

    val input = readInput("day06/input")
    println(part1(input))
}