package academy.learnprogamming.challenge2

import academy.learnprogamming.javacode.DummyClass

fun main(args: Array<String>) {
    val float1: Float? = -3847.384f
    val float2: Float? = -3847.384f.toFloat()
    val short1 = shortArrayOf(1, 2, 3, 4, 5)
    val ints = Array<Int?>(40) { i -> (i + 1) * 5 }
    val chars = charArrayOf('a', 'b', 'c')

    DummyClass().method1(chars)

    val x: String? = "I AM IN UPPERCASE"
    val y = x?.lowercase() ?: "I give up!"

    x.let { println(it?.lowercase()?.replace("am", "am not")) }

    val myNonNullVariable: Int? = null

    myNonNullVariable?.toDouble()
}