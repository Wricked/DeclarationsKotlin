package youtube.lists

import kotlin.random.Random

fun main() {
    val listof = listOf(1, 2, 3, 4, 5)
    // [1, 2, 3, 4, 5]

    val list = List(5) { idx -> "No. $idx" }
    //[No. 0, No. 1, No. 2, No. 3, No. 4]

    val salad = "Word-salad".toList()
    //[W, o, r, d, -, s, a, l, a, d]

    val mapof = mapOf<Int, String>(
        1 to "Gold",
        2 to "Silver",
        3 to "Bronze"
    ).toList()
    //  [(1, Gold), (2, Silver), (3, Bronze)]

    /*
    - () type of parameter to function
    - -> Returns Int? (nullable)
    - { } function inside
    - nextFunction : is the function itself
    - Val/Var that returns value is ()
    - Val/Var that declares another funcion does not have ()
    */
    val nextFunction: () -> Int? = {
        Random.nextInt(100).takeIf { it > 30 }
    }
    //println(nextFunction()) // Prints result of function
    //println(nextFunction) // Prints the function
    val generateSequence = generateSequence(nextFunction)
    //[87, 53, 71, 42, 99] -> Varies

    val zeroToTen = (0..10).toList()
    //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    val mutList = mutableListOf(1, 2, 3)
    val otherList = mutList.toList()

    mutList[0] = 5

    // mutList [5, 2, 3]
    // otherList [1, 2, 3]

}