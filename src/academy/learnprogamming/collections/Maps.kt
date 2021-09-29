package academy.learnprogamming.collections

fun main() {
    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
    2 to Car("red", "Ford", 2016),
    3 to Car("black", "Honda", 2014))

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf<String, Car>("John's Car" to Car("Red", "Range Rover", 2010),
    "Jane's Car" to Car("Blue", "Hyundai", 2012))
    println(mutableMap.javaClass)
    println(mutableMap)

    val hashMap = hashMapOf<String, Car>("Mary's Car" to Car("Red", "Chevrolet", 2010),
    "Paul's Car" to Car("Grey", "Lincoln", 2014))
    hashMap.put("Carl's Car", Car("Purple", "Jaguar", 2010))
    println(hashMap.javaClass)
    println(hashMap)

    val pair = Pair(10, "ten")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair // Can also create two val in the same row to get the first and second value respectively.
    println(firstValue)
    println(secondValue)

    for ((key,value) in mutableMap) { // It's the same as declaring a var to for and using it as field.key and field.value.
        println(key)
        println(value)
    }

    val car = Car("Blue", "Corvette", 1959)
    val (color, model, year) = car // Must implement component functions (Deconstructing declaration). It doesn't come out of the box.
    println(color + model + year)

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20)) // Adds new value.
    println(setInts.plus(10)) // Does nothing as it already exists. (Sets cannot have duplicate elements).
    println(setInts.minus(19)) // Removes element 19 from the list.
    println(setInts.minus(100)) // Doesn't exist.
    println(setInts.average()) // Average of the list (Result as Double).
    println(setInts.drop(3)) // Drops the first 3 elements from the Set

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    println(mutableInts.plus(10)) // Returns as a result.
    println(mutableInts)
}

class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}