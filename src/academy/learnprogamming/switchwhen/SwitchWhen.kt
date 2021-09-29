package academy.learnprogamming.switchwhen

import java.math.BigDecimal

fun main() {
    var num = 90

    when(num) {
        100, 600 -> println("100.")
        200 -> println("200.")
        300 -> println("300.")
        in 0..99 -> println("In range 0..99.")
        else -> println("Doesn't match anything.")
    }

    val y = 10

    when (num) { // num = y + 80 or 90
        y + 80 -> println("90.")
        y + 90 -> println("100.")
    }

    val obj: Any = "I'm a String."
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj3
    if (something is String) {
        println(something.uppercase())
    } else if (something is BigDecimal) {
        println(something.remainder(BigDecimal(10.5)))
    } else if (something is Int) {
        println("${something - 22}")
    }

    val zed = when (something) {
        is String -> {
            println(something.uppercase())
            1 // zed = 1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2 // zed = 2
        }
        is Int -> {
            println("${something - 22}")
            3 // zed = 3
        }
        else -> {
            println("Something else.")
            -1 // zed = -1
        }
    }
    println(zed.javaClass)

    val timeofYear = Season.SPRING
    val str = when (timeofYear) {
        Season.WINTER -> "It's cold."
        Season.SPRING -> {
            num += 5
            "Flowers are blooming." // Last line will be the return value.
        }
        Season.SUMMER -> "It's hot."
        Season.FALL -> "It's getting cooler."
    }
    println(str + num)

    val num2 = -50
    if (num < num2) {
        println("num is less than num2")
    } else if(num > num2) {
        println("num is greater than num2")
    } else {
        println("num = num2")
    }

    when {
        num < num2 -> {
            println("num is less than num2")
        }
        num > num2 -> {
            println("num is greater than num2")
        }
        else -> {
            println("num = num2")
        }
    }
}

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}