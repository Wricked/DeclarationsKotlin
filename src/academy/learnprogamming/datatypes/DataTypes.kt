package academy.learnprogamming.datatypes

import academy.learnprogamming.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    //Kotlin does not convert int to long like in JAVA.
    val myInt = 10
    var myLong = 22L
    println("My int is int? ${myInt is Int}.")

    myLong = myInt.toLong() // Must use toLong()

    val myByte : Byte = 111
    var myShort : Short
    myShort = myByte.toShort()

    val anotherInt = 5
    var myDouble = 65.984
//   println(myDouble is Double) // checks if is Double

    val myFloat = 838.8492f
//    println("This is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b' // Char by single quotes and 1 letter.
    val myCharInt = 65
//    println(myCharInt.toChar())

    val myBoolean = false
    val booleanVariable = false
    val onVacation = DummyClass().isVacationTime(booleanVariable)
//    println(onVacation)

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)

/*
    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])
*/

    val evenNumbers = Array(16) { i -> i * 2 } // Lambda expression only for even numbers in array of size 16
//    println(evenNumbers.toList())

    val lotsOfNumbers = Array(100000) { i -> i +1 }
    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
//    println(someArray.toList())
    someArray = Array(6) { i -> (i + 1) * 10 }
//    println(someArray.toList())

    val mixedArray = arrayOf("Hello", 22, BigDecimal(10.5), 'a')
//    println(mixedArray.toList())
//    println(mixedArray is Array)

    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
//    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray = myIntArray.toTypedArray()

}