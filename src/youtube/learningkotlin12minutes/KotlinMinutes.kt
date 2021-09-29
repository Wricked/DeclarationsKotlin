package youtube.learningkotlin12minutes

import java.util.*

fun main() {
    val firstName = "Rahul" // Type interference -> No need to declare type of val (String).
    var weight = 160 // Var is variable, val is fixed value
    val myVariable = false

    val s1 = "Call me"
    val s2 = " maybe"
    val combined = s1 + s2
    println(combined)

    val myString = "Kotlin" // Separate by characters
    println(myString[0])
    println(myString[1])
    println(myString[2])
    println(myString.isEmpty()) // false
    println(myString.length) // 6
    println(myString.substring(2,4)) // tl
    println("The string value is $myString") // String interpolation+
    val myInteger = 5

    val examScore = 88 // Conditionals
    if(examScore > 70) {
        println("You passed!")
    } else {
        println("You failed :c")
    }

    // Lists
    // To change the list must be mutable, otherwise just list
    val names = mutableListOf("Ali", "Maya", "Chen")
    println(names[2])
    names.add("Dymtro")
    println(names)

    // for
    for(name in names) {
        println(name)
    }
    for(i in 1..5) { // from 1 to 5
        println(i)
    }
    for(i in 1 until 5) { // from 1 to 4
        println(i)
    }

    myFunction("Hi")

    val instagramBio : String? = null // Nullability, can't print without condition to null.
    if(instagramBio != null) {
        println(instagramBio.uppercase(Locale.getDefault()))
    }
    println(instagramBio?.uppercase(Locale.getDefault())) // prints String otherwise null
}

private fun myFunction (name : String) { // private
    println("Hello, $name")
}

fun nullability (name : String?) { // nullability
    println("Hello, $name")
}