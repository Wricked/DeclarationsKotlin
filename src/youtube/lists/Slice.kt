package youtube.lists

fun main() {
    val myList = listOf("a", "b", "c", "d", "e")
    //myList.slice(listOf(0, 2, 4)) -> [a, c, e]
    //myList.slice(0..3) -> [a, b, c, d]
    //myList.slice(0..myList.lastIndex step 2) -> [a, c, e] // skips 1 index
    //myList.slice(2 downTo 0)) -> [c, b, a]
    //(0..10).toMutableList() -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    //listOf(1, 2, 3).toMutableList() -> [1, 2, 3]

    val m = mutableListOf(1, 2, 3)
    m.add(4)
    m += 4
    // [1, 2, 3, 4, 4]

    m.add(2, 10)
    //[1, 2, 10, 3, 4, 4]

    m += listOf(5, 6, 7)
    // [1, 2, 10, 3, 4, 4, 5, 6, 7]

    val n = mutableListOf(1, 2, 4, 3, 4, 3, 4, 3)
    n -= 3
    n.remove(3)
    // [1, 2, 4, 4, 4, 3]

    n -= listOf(1, 4)
    // [2, 3]

    n.removeAt(1)
    // [2]

    n[0] = 1
    // [1]

    val fruits = mutableListOf("melon", "orange", "pineapple", "apple")

    val stiurf = fruits.asReversed()
    //[apple, pineapple, orange, melon]

    fruits[1] = "banana"
    //[apple, pineapple, banana, melon]

    stiurf[2] = "lemon"
    //[melon, lemon, pineapple, apple]
}