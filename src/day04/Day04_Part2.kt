fun main() {

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day03/test_input")
    check(part2(testInput) == 0)

    val input = readInput("day03/input")
    println(part2(input))
}