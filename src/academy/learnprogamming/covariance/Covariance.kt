package academy.learnprogamming.covariance

import java.util.concurrent.Flow

fun main() {
    //A covariance class is a generic class where subtyping is preserved. Making a type parameter of a covariant class makes it possible to pass values of that class as function arguments and return values when the type arguments don’t exactly match the ones in the function definition. When dealing a with a subtype, then it's not preserved.
    val shortsList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt(shortsList)
}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

// We cannot use as Flower "in" position on Garden. Only on "out" to functions.
class Garden<out T: Flower> (val something: T) { // "Out" keyword makes it covariant and the error on waterGarden is free.
    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]
    //fun plantFlower(flower: T) // Cannot accept because it can accept any kind of flower, not only a Rose Garden.
}
