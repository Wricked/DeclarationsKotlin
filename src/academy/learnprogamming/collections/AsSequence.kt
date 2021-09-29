package academy.learnprogamming.collections

fun main() {
    // asSequence runs as a recipe to be run with a terminal operation, like .toList()
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("Filtering $it"); it[0] == 'J' }
        .map { println("Mapping $it"); it.uppercase() }
        .find { it.endsWith('E') }
}