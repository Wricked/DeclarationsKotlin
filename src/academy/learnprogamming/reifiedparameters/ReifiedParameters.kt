package academy.learnprogamming.reifiedparameters

import java.math.BigDecimal

fun main() {
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-2.34223))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList) // Must tell the compiler which type we want as return in <>.
    for (item in bigDecimalsOnly) {
        println(item)
    }
}

inline fun <reified T> getElementsOfType(list: List<Any>) : List<T> { // Inline function replaces the body directly into places where the function gets called.
    val newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if(element is T) { // Reified = Prevents the type from being erased in runtime. You only use Reification if you need to check a type inside a function.
            newList.add(element)
        }
    }
    return newList
}