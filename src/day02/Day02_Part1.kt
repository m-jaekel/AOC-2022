fun main() {
    /**
     * A Y
     * B X
     * C Z
     *
     * A,X -> Rock (1)
     * B,Y -> Paper (2)
     * C,Z -> Scissors (3)
     *
     * lost -> 0
     * draw -> 3
     * win -> 6
     *
     */

    fun part1(input: List<String>): Int {

        var score = 0
        input.forEach {
            val shapes: List<String> = it.chunked(1)
            score += checkWin(shapes[0], shapes[2]) + getShapeScore(shapes[2])
        }

        return score
    }

    val testInput = readInput("day02/test_input")
    check(part1(testInput) == 15)

    val input = readInput("day02/input")
    println(part1(input))
}

fun checkWin(player1: String, player2: String): Int = when {
    player1 == "A" && player2 == "Y" -> 6
    player1 == "A" && player2 == "X" -> 3
    player1 == "A" && player2 == "Z" -> 0
    player1 == "B" && player2 == "X" -> 0
    player1 == "B" && player2 == "Y" -> 3
    player1 == "B" && player2 == "Z" -> 6
    player1 == "C" && player2 == "X" -> 6
    player1 == "C" && player2 == "Z" -> 3
    player1 == "C" && player2 == "Y" -> 0
    else -> throw Exception("invalid")
}

fun getShapeScore(shape: String): Int = when (shape) {
    "X" -> 1
    "Y" -> 2
    else -> 3
}
