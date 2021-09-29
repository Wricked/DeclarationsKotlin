package academy.learnprogamming.collections

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "green", "purple", "green")

    println(strings.toList())
    println(strings.asReversed())

    if(strings.size > 5) {
        println(strings[5])
    }

    println(strings.getOrNull(5)) // Get the element number 5 or null

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.maxOrNull()) // Get the max value or null. Max is deprecated.

    println(colorList.zip(strings)) // Zip = Pair, picks the first element of each list and creates another list with those values together.

    val mergedLists = listOf(colorList, strings)
    println(mergedLists) // Two lists as elements in one list.

    val combinedList = colorList + strings // Concatenated.
    println(combinedList)

    val noDupsList = colorList.union(strings) // No Duplicates + concatenation.
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("Some other season.")
    println(mutableSeasons)
}