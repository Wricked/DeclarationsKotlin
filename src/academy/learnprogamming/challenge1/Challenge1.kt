package academy.learnprogamming.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2) // Referentially equality
    println(hello1 == hello2) // Structurally equality

    var number1 = 2988
    val any : Any = "The Any type is the root of the Kotlin class hierarchy."

    if (any is String) {
        println(any.toString().uppercase())
    }
    println("""1   1
        1  11
        1 111
        11111""".trimMargin("1"))
    println("   1\n  11\n 111\n1111")
}