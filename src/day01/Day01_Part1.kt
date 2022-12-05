package day01

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var calories = listOf<Int>()

        var startIndex = 0
        input.forEachIndexed { index, s ->
            if (s.isBlank()) {
                calories = calories + listOf(input.subList(startIndex, index).sumOf { it.toInt() })
                startIndex = index + 1
            }
        }
        return calories.max()
    }

    val testInput = readInput("day01/test_input")
    check(part1(testInput) == 24000)

    val input = readInput("day01/input")
    println(part1(input))
}
