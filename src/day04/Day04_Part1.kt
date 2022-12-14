package day04

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        var fullContainCount = 0
        parseElfPairs(input).forEach {
            if (it[0].containsAll(it[1]) || it[1].containsAll(it[0])) {
                fullContainCount++
            }
        }
        return fullContainCount
    }

    val testInput = readInput("day04/test_input")
    check(part1(testInput) == 2)

    val input = readInput("day04/input")
    println(part1(input))
}

fun parseElfPairs(input: List<String>) = input.map { pairs ->
    pairs.split(",").let { elves ->
        elves.map { elf ->
            elf.split("-").map { ids -> ids.toInt() }.let { (it[0]..it[1]).toSet() }
        }
    }
}