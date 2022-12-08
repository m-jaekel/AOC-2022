package day09

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day09/test_input")
    check(part1(testInput) == 0)

    val input = readInput("day09/input")
    println(part1(input))
}