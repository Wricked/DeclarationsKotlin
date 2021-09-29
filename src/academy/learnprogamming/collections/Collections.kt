package academy.learnprogamming.collections

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass) // List Of can change the element of the list, but not add or remove elements on it.

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    var strings1 = listOf<String>()
    if(!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("Hello", null, "good bye") // null is not printed or added to the list of not null.
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass) // Mutable list

    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass) // Same as ArrayListOf.

    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)


    val array = arrayOf("black", "white", "green") // Transforming array to List.
    val colorList = listOf(*array) // We can also do array.toList() to have the same logic.
    println(colorList)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList()) // Same logic as above.
}