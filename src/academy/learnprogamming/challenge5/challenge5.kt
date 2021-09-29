package academy.learnprogamming.challenge5

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val listPeople = listOf(joe, jane, mary, john, jean)
    val mapPeople = listPeople.associateBy { it.lastName }
    val pairPeople: List<Pair<String, String>> = mapPeople.values.map { Pair(it.firstName, it.lastName) }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val list3 = list1.filter { list2.contains(it) }

    println(mapPeople)
    println(mapPeople.filterKeys { it.startsWith("S") }.count())
    println(pairPeople)
    mapPeople.also { it2 -> it2.map { println("${it.value.firstName} is ${it.value.age} years old.") } }
    println(list3)

    val (fName, lName, age) = joe // Only works as Data class or operator fun components
    println("fName = $fName, lName = $lName, age = $age.")

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

data class Person(val firstName: String, val lastName: String, val age: Int) {
    /*operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age*/ // Either Data class or operator fun.
}

class Box<out T> {// Covariant we can only take and not add papers to the box.

    /*fun takePaper(): T { // Contravariant purpose.
        return T
    }

    fun addPaper(/*paper: T*/): T { // Covariant purpose.

    }*/
}
open class Paper

class Regular: Paper()

