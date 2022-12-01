fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day01/test_input")
    check(part1(testInput) == 1)

    val input = readInput("day01/input")
    println(part1(input))
}
