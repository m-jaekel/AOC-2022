package day03

import readInput

fun main() {

    fun part2(input: List<String>): Int {

        val identityItems = findIdentityItems(input)

        return calculatePriorityScore(identityItems)
    }

    val testInput = readInput("day03/test_input")
    check(part2(testInput) == 70)

    val input = readInput("day03/input")
    println(part2(input))
}

private fun findIdentityItems(input: List<String>): List<Char> {

    val identityItems = mutableListOf<Char>()
    val groups: List<List<String>> = input.chunked(3)

    groups.forEach { group: List<String> ->

        val items: List<MutableSet<Char>> = group.map {
            it.toCharArray().toMutableSet()
        }

        identityItems += items[0].intersect(items[1]).intersect(items[2])
    }

    return identityItems
}