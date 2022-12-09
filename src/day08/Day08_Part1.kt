package day08

import readInput
import java.util.*

fun main() {
    fun part1(input: List<String>): Int {
        val treeMap: List<List<Tree>> = input.map { row ->
            row.chunked(1).map {
                Tree(it.toInt(), UUID.randomUUID())
            }
        }

        val transposedTreeMap = treeMap.mapIndexed { index, row ->
            List(row.size) { innerIndex ->
                treeMap[innerIndex][index]
            }
        }

        val visibleTrees: MutableSet<UUID> = mutableSetOf()

        checkTreeVisibility(treeMap, visibleTrees)
        checkTreeVisibility(treeMap.map { it.reversed() }, visibleTrees)
        checkTreeVisibility(transposedTreeMap, visibleTrees)
        checkTreeVisibility(transposedTreeMap.map { it.reversed() }, visibleTrees)

        return visibleTrees.size
    }

    val testInput = readInput("day08/test_input")
    check(part1(testInput) == 21)

    val input = readInput("day08/input")
    println(part1(input))
}

private fun checkTreeVisibility(
    treeMap: List<List<Tree>>,
    visibleTrees: MutableSet<UUID>,
) {
    var maxTreeHeight: Int
    treeMap.forEachIndexed { _, trees: List<Tree> ->
        maxTreeHeight = -1
        trees.forEachIndexed { _, tree ->
            if (tree.height > maxTreeHeight) {
                maxTreeHeight = tree.height
                visibleTrees.add(tree.id)
            }
        }
    }
    maxTreeHeight = -1
}

data class Tree(val height: Int, val id: UUID)