package academy.learnprogamming.ifexpression

fun main() {
    val someCondition = 20 < 22
    val num = if (someCondition) 50 else 592
    val num2 = if (someCondition) { // must have if and else

        println("Something")
        50
    } else {
        println("Something else")
        592
    }

    println(num2)
    println("The result of the if expression is ${if (someCondition) {
        println("Something")
        50
    } else {
        println("Something else")
        592
    }}")

    if (someCondition) {
        println("Something")
    }

    val x = if(someCondition) println("Something x") else println("Something else x")
    println(x.javaClass)
}