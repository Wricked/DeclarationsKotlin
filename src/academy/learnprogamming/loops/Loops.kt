package academy.learnprogamming.loops

fun main() {
    val range = 1..5 // 1 to 5 1, 2, 3, 4, 5
    val charRange = 'a'..'z' // a to z a, b, c, d, e, f, g, h, i, j, k ,l, m, n, o, p, q, r, s, t, u, v, x, w, y, z
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1) // 5, 4, 3, 2, 1
    val r = 5..1 // 5, 4, 3, 2, 1

    println(5 in r) //5 = 5, 5 = 4, 5 = 3, 5 = 2, 5 = 1
    println(5 in backwardRange) // Finds 5 in 5, 4, 3, 2, 1 and compares

    val stepRange = 3..15 // 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
    val stepThree = stepRange.step(3) // 3, 6, 9, 12, 15
    val reversedRange = range.reversed() // 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3

    for (i in range) {
        println(i)
    }
    for (step in stepRange) {
        println(step)
    }
    for (three in stepThree) {
        println(three)
    }
    for (reversed in reversedRange) {
        println(reversed)
    }
    for (num in 1..20 step 4) {
        println(num)
    }
    for (i in 20 downTo 15) {
        println(i)
    }
    for (i in 20 downTo 10 step 5) {
        println(i)
    }
    for (i in 1 until 10) { // 1 to 9, not 10.
        println(i)
    }

    val s = "goodbye"
    val sRange = 0..s.length

    sRange.forEach {
        println(it)
    }

    val seasons = arrayOf("spring", "summer", "winter", "fail")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    val str = "Hello"
    println('e' in str)
    println('e' !in str)

    seasons.forEach { println(it) }
    seasons.forEachIndexed{ index, value -> println("$value is season number $index")}

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) { // Naming the loop as "jloop".
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@jloop // breaks "jloop", not k loop
                }
            }
        }
    }
}