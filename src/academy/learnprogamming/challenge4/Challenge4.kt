package academy.learnprogamming.challenge4

fun main() {
    val range = 5..5000
    //(range step 5).forEach(::println)
    val negativeRange = -500..0
    //negativeRange.forEach(::println)

    /*//Fibonacci Sequence
    val numbers = arrayOfNulls<Int>(15)
    numbers[0] = 0
    numbers[1] = 1
    for (it in numbers.indices) {
        if(it > 1) {
            numbers[it] = numbers[it - 2]?.plus(numbers[it - 1]!!)
        }
        println(numbers[it])
    }*/

    /*for (i in 1..5) {
        println(i)
        if(i > 1) {
            break
        }
        jloop@for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                if (k < 98) {
                    break@jloop // breaks "jloop", not k loop
                }
                println(k)
            }
        }
    }*/

    var num = 0
    var doubleNumber = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println(doubleNumber)
}