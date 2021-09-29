package academy.learnprogamming.nullreferences

fun main(args: Array<String>) {
  /*  val str : String? = null
    val str4 = str!!.uppercase()// !! to make sure that your value field is not null, or you want an exception

    if (str != null) {
        str.uppercase()
    } else {
        throw Exception() // it throws a exception on the assertion in this case line 7 not line 12.
    }// or

    println("What happens if is null? ${str?.uppercase()}")

    //val countryCode : String? = bankBranch?.address?.country?.countryCode // If any is null, it will return null
    //val whatever = bankBranch?.address?.country ?: "US" // If any is null, it will return "US"

    val str2 = str ?: "This is the default value." // put str in str2 otherwise put the string.

    println(str2)

    val something : Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)

    val str5: String? = "This isn't null"
    str5?.let { printText(it) } // let what is inside the brackets happen while str5 isn't null.
    */

    val nullableInts = arrayOfNulls<Int>(5) // Array of 5 integers that can nullables
    for (i in nullableInts) {
        printText(i.toString())
    }
}

fun printText(text: String) {
    println(text)
}
