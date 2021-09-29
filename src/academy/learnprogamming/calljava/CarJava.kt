package academy.learnprogamming.calljava

import academy.learnprogamming.javacode.Car

fun main() {
    val car = Car("Blue", "Ford", 2015)
    car.color = "Green"
    println(car)
    var model: String? = car.model // Can return nullable.
    println(model)
    model = null
    println(model)
    car.model = null
    println(car)
    //car.color = null // Exception due @NotNull annotation.
    println(car)

    car.variableMethod(5,"hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(2, *strings) // It doesn't work as array, must unpack the array with *.

    car.wantsIntArray(intArrayOf(1, 2, 3, 4))

    (car.anObject as? java.lang.Object) // To access the Object Java Class, must cast to that.


    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod( { println("I'm in a Thread running from Lambda!") } )
}