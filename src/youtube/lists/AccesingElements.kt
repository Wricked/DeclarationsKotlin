package youtube.lists

fun main() {
    val myList = listOf("Burger", "Hot-dog", "Pizza")
    //myList[1] -> Hot-dog
    //myList[3] -> Out of bounds
    //myList.getOrNull(3) -> null
    /*println(myList.getOrElse(3) { // There is no index 3!
         "There is no index $it!"
    })*/

    val listOfNullableItems = listOf(1, 2, null, 4)
    val item = listOfNullableItems[2] ?: 0 // prints 0 if null

}

