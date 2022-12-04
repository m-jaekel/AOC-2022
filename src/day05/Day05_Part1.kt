fun main() {

    fun part1(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("day05/test_input")
    check(part1(testInput) == 0)

    val input = readInput("day05/input")
    println(part1(input))
}
