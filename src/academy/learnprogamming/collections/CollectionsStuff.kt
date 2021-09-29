package academy.learnprogamming.collections

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    Runtime.getRuntime().totalMemory()
    println(setInts.filter { it % 2 != 0 }) // Lambda is a tiny function that returns the value in case it's ture, by default it is the iterator.

    val immutableMap = mapOf(1 to CarsCollectionStuff("Green", "Toyota", 2015),
    2 to CarsCollectionStuff("Blue", "Ford", 2012),
    3 to CarsCollectionStuff("Silver", "Honda", 2018),
    17 to CarsCollectionStuff("Red", "BMW", 2015),
    8 to CarsCollectionStuff("Green", "Ford", 2010))

    val mutableMap = mutableMapOf(1 to CarsCollectionStuff("Green", "Toyota", 2015),
    2 to CarsCollectionStuff("Blue", "Ford", 2012),
    3 to CarsCollectionStuff("Silver", "Honda", 2018))

    println(immutableMap.filter { it.value.year == 2018 }) // Can also filter by attribute value from a Class.
    println(mutableMap.filter { it.value.color == "Blue" }) // Can also filter by attribute value from a Class. It doesn't change the instance of the map.

    val ints = arrayOf(1, 2, 3, 4, 5)
    val add20List : MutableList<Int> = mutableListOf()
    for (i in ints) {
        add20List.add(i + 20)
    }

    println(add20List)

    val add10List = ints.map { it + 10} // Same as above.

    println(add10List)
    println(immutableMap.map { it.value.year })
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color }) // Filters only ford then shows the color of them.
    println(immutableMap.all { it.value.year > 2014 }) // Searches if all cars are newer than 2014.
    println(immutableMap.any { it.value.year > 2014 }) // Searches if any cars are newer than 2014.
    println(immutableMap.count { it.value.year > 2014 }) // Count cars that are newer than 2014.
    println(immutableMap.toSortedMap()) // Sort the cars by ID.

    val cars = immutableMap.values

    println(cars.find { it.year > 2014 }) // Find the first car newer than 2014 and stops.
    println(cars.groupBy { it.color }) // Cars by color.
    println(cars.sortedBy { it.year }) // Sort cars by year.
}

data class CarsCollectionStuff (val color: String, val model: String, val year: Int)