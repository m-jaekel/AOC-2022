package day05

import readInput

fun main() {
    fun part1(input: List<String>): String {
        parseMoves(input).forEach { move ->
            repeat(move[0]) {
                val stack = data04_data[move[1] - 1].first()
                data04_data[move[1] - 1].removeFirst()
                data04_data[move[2] - 1].addFirst(stack)
            }
        }
        return getCompleteStackSequence()
    }
    println(part1(readInput("day05/input")))
}

fun parseMoves(input: List<String>) = input.map { move ->
    val stackCount = move.substringAfter(" ").substringBefore(" ").toInt()
    val position1 = move.substringAfter("m ").substringBefore(" t").toInt()
    val position2 = move.substringAfter("o ").toInt()
    listOf(stackCount, position1, position2)
}

private fun getCompleteStackSequence(): String {
    val result = StringBuilder()
    data04_data.forEach {
        result.append(it.first())
    }
    return result.toString()
}

/**
 *
 * [T] [V]                     [W]
 * [V] [C] [P] [D]             [B]
 * [J] [P] [R] [N] [B]         [Z]
 * [W] [Q] [D] [M] [T]     [L] [T]
 * [N] [J] [H] [B] [P] [T] [P] [L]
 * [R] [D] [F] [P] [R] [P] [R] [S] [G]
 * [M] [W] [J] [R] [V] [B] [J] [C] [S]
 * [S] [B] [B] [F] [H] [C] [B] [N] [L]
 *  1   2   3   4   5   6   7   8   9
 *
 */
val data04_data: List<ArrayDeque<String>> = listOf(
    ArrayDeque(listOf("T", "V", "J", "W", "N", "R", "M", "S")),
    ArrayDeque(listOf("V", "C", "P", "Q", "J", "D", "W", "B")),
    ArrayDeque(listOf("P", "R", "D", "H", "F", "J", "B")),
    ArrayDeque(listOf("D", "N", "M", "B", "P", "R", "F")),
    ArrayDeque(listOf("B", "T", "P", "R", "V", "H")),
    ArrayDeque(listOf("T", "P", "B", "C")),
    ArrayDeque(listOf("L", "P", "R", "J", "B")),
    ArrayDeque(listOf("W", "B", "Z", "T", "L", "S", "C", "N")),
    ArrayDeque(listOf("G", "S", "L")),
)
