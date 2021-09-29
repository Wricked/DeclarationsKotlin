package academy.learnprogamming.functions

fun main(args: Array<String>) { // If no return specified, it will return Unit
    println(labelMultiply(1, 2))
    println(labelMultiply2(3, 4, "The result is: "))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car = Car ("Blue","Toyota", 2015)
    val car2 = Car ("Red","Toyota",2015)
    val car4 = car.copy(year = 2016, color = "Green")

    printColors(car, car2, car4, str = "Car colors: ")

    val manyCars = arrayOf(car, car2, car4)
    printColors(*manyCars, str = "1") // Must put * to work.

    val lotsOfCars = arrayOf(car2, car4)
    val car5 = Car("Pink","Ford",2012)
    val moreCars = arrayOf(*manyCars,*lotsOfCars, car5)
    println(moreCars.toList())

    println(Utils().upperFirstAndLast("this is all in lowercase"))
    val str = "this is all in lowercase"
    println(str.upperFirstAndLast())
}

fun labelMultiply(operand1 : Int, operand2: Int, label: String = "The answer is: ") : String {
    return ("$label ${operand1 * operand2}")
}
// or
fun labelMultiply2(operand1 : Int, operand2: Int, label: String)  = "$label ${operand1 * operand2}"

fun whatever() =  3 * 4

class Employee (private val firstName : String) {
    fun  upperCaseFirstName() = firstName.uppercase()
}

data class Car(val color : String, val model : String, val year : Int)

fun printColors(vararg cars : Car, str : String) = str + cars.toList()

fun String.upperFirstAndLast() : String { // Extension function, acts like string function.
    val upperFirst = substring(0,1).uppercase() + substring(1) // no need to declare this or entry string.
    return upperFirst.substring(0, upperFirst.length -1) +
            upperFirst.substring(upperFirst.length -1, upperFirst.length).uppercase()
}