import day05.data04_data
import day05.parseMoves

fun main() {
    fun part2(input: List<String>): String {
        parseMoves(input).forEach { move ->
            val stack = data04_data[move[1] - 1].take(move[0])
            repeat(move[0]) {
                data04_data[move[1] - 1].removeFirst()
            }
            stack.reversed().forEach {
                data04_data[move[2] - 1].addFirst(it)
            }
        }
        return getCompleteStackSequence()
    }
    println(part2(readInput("day05/input")))
}

private fun getCompleteStackSequence(): String {
    val result = StringBuilder()
    data04_data.forEach {
        result.append(it.first())
    }
    return result.toString()
}