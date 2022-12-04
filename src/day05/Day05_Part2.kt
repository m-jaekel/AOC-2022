fun main() {

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day05/test_input")
    check(part2(testInput) == 0)

    val input = readInput("day05/input")
    println(part2(input))
}