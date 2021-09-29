package academy.learnprogamming.trycatch

fun main() {
    // Catch doesn't need types of Exception as it doesn't use.
    //(getNumber("22.8") ?: "I can't print the result.")

    notImplementedYet("string")
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null // return value
    } finally { // "Finally" block will never return any value.
        println("I'm in the finally block")
    }
}