fun main() {

    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day04/test_input")
    check(part1(testInput) == 0)

    val input = readInput("day04/input")
    println(part1(input))
}