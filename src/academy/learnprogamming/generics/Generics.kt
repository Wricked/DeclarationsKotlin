package academy.learnprogamming.generics

import java.lang.Appendable
import java.lang.StringBuilder
import java.math.BigDecimal

fun main() {
    val list = mutableListOf("Hello")
    list.add("Another String")
    printCollection(list)

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(203.23))
    printCollection(bdList)

    bdList.printCollection2()
    list.printCollection2()

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts : List<Short> = listOf(10, 20, 30 ,40)
    val floats : List<Float> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3")

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

    printCollection3(strings)
    printCollection3(shorts)
    printCollection3(ints)

    if(strings is List<String>) {
        println("This list contains strings.")
    }

    val listAny: Any = listOf("str1", "str2") // If we use ints we receive a Class Cast Exception on line 44 due the compiler cannot check the list.
    if (listAny is List<*>) {// Star projection, which can identify the list of Any type, but not as String one.
        println("This is a Star Projection.")
    }

    if(listAny is List<*>) { // Check if listAny contains a list and uses casting to List of Strings and treat the second element with replace.
        println("This is list contains strings.")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }
}

fun <T>printCollection(list: MutableList<T>) { // <T> is Generics, which means that T is receives an Object T
    // and returns the same object type within the function.
    for (i in list) {
        println(i)
    }
}

fun <T> List<T>.printCollection2() { // Created as Extension function of Object List and has the same result as function above.
    for (item in this) {
        println(item)
    }
}

fun <T: Number> convertToInt(collection: List<T>) { // toInt doesn't work with non numbers, so we must explicitly say that T will accept Numbers (Group of classes).
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable { // "where" keyword means more than one upperbound. Meaning a condition to make the Class to be accepted. But means same as convertToInt.
    println("Result is ${item1.append(item2)}")
}

fun <T:Any> printCollection3(collection: List<T>) { // Any means non-nullable type.
    for (item in collection) {
        println(item)
    }
}