fun main() {

    fun part1(input: List<String>): Int {
        val incorrectItems = input.map {
            getIncorrectItem(it)
        }
        return calculatePriorityScore(incorrectItems)
    }

    val testInput = readInput("day03/test_input")
    check(part1(testInput) == 157)

    val input = readInput("day03/input")
    println(part1(input))
}

private fun getIncorrectItem(backpackItems: String): Char {

    val items = backpackItems.chunked(backpackItems.length / 2)
    val compartmentOne = items[0]
    val compartmentTwo = items[1]

    compartmentOne.forEach { item1 ->
        compartmentTwo.forEach { item2 ->
            if (item1 == item2) {
                return item1
            }
        }
    }
    throw Exception("no incorrect item found!")
}

fun calculatePriorityScore(incorrectItems: List<Char>): Int {
    // https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
    val score = incorrectItems.map { item ->
        when (item.code) {
            // score 27 - 52 for upper case
            in 65..90 -> item.code - 38
            // score 1 - 26 for lower case
            in 97..122 -> item.code - 96
            else -> throw Exception("unusual item found")
        }
    }
    return score.sumOf { it }
}