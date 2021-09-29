package academy.learnprogamming.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String){
    // Class are by default public and final. To remove Final, we need to put "open" or "abstract" keyword.

    open fun printModel() = println("The model of this printer is $modelName.") // "Open" keyword makes fun extendable.
    abstract fun bestSellingPrice() : Double
}

open class LaserPrinter(modelName: String, ppm : Int) : Printer(modelName) { // Subclass must call the main class constructor
    //or
    //constructor(): super()

    final override fun printModel() = println("The model of this laser printer is $modelName") // To put a stop on inheritance we put "final" keyword. final override fun ....
    override fun bestSellingPrice(): Double = 123.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {
    // Sub sub class
}

open class Something: MySubInterface {
    var someProperty : String = "Something"

    override val number: Int = 25
    override val number2: Int = 25

    constructor(someParameter: String) { // secondary constructor
        someProperty = someParameter
        println("I'm in the parent's constructor.")
    }

    // Using primary and secondary constructors doesn't work as the secondary needs the first one and it's not possible to split the constructor in two.
    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("I'm in the child's constructor.")
    }
}

data class DataClass (val number : Int) { // Data cannot be extended.
 // Data Class are meant to hold data
   /* The compiler automatically derives the following members from all properties declared in the primary constructor:

    equals()/ hashCode() pair

    toString() of the form "User(name=John, age=42)"

    componentN() functions corresponding to the properties in their order of declaration.

    copy() function (see below).*/
}

interface MyInterface { // Interfaces cannot store states, and provide implementations.
    val number: Int
    val number2 : Int

    fun myFunction(str: String) : String
}

interface MySubInterface: MyInterface { // Sub Interface of Interface.
    fun mySubFunction(num : Int) : String
}