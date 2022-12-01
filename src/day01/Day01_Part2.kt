fun main() {
    fun part2(input: List<String>): Int {
        var calories = listOf<Int>()

        var startIndex = 0
        input.forEachIndexed { index, s ->
            if (s.isBlank()) {
                calories = calories + listOf(input.subList(startIndex, index).sumOf { it.toInt() })
                startIndex = index + 1
            }
        }
        return (calories.sorted().reversed().subList(0, 3).sum())
    }

    val input = readInput("day01/input")
    println(part2(input))
}
