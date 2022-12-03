fun main() {

    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day03/test_input")
    check(part1(testInput) == 157)

    val input = readInput("day03/input")
    println(part1(input))
}