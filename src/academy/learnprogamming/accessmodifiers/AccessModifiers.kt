package academy.learnprogamming.accessmodifiers

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    val car = Car ("Blue","Toyota", 2015)
    println(car)
    val car2 = Car ("Blue","Toyota",2015)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016, color = "green")
    println(car4)

//    println(MY_CONSTANT)

    val emp = Employee("John")
    println(emp.firstName)
    val emp2 = Employee("John")
    println(emp == emp2)
 /*   emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
*/
}

data class Car(val color : String, val model : String, val year : Int)

private class Employee (val firstName: String, fullTime: Boolean = true){ // Private -> Seen in the same file
    var fullTime = fullTime // custom accessor
    get() {
        println("Running the custom get")
        return field // backing field = identifier field, which is fulltime
    }
    set(value) {
        println("Running the custom set")
        field = value
    }
}

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}