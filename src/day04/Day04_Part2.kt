fun main() {

    fun part2(input: List<String>): Int {
        var fullContainCount = 0
        parseElfPairs(input).forEach {
            if (it[0].intersect(it[1]).isNotEmpty()) {
                fullContainCount++
            }
        }
        return fullContainCount
    }

    val testInput = readInput("day04/test_input")
    check(part2(testInput) == 4)

    val input = readInput("day04/input")
    println(part2(input))
}