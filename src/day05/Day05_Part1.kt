fun main() {

    fun part1(input: List<String>): String {
        return input.first()
    }

    val testInput = readInput("day05/test_input")
    check(part1(testInput) == "CMZ")

    val input = readInput("day05/input")
    println(part1(input))
}
