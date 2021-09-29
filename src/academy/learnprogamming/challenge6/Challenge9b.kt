package academy.learnprogamming.challenge6

import org.jetbrains.annotations.NotNull
import java.lang.IllegalArgumentException
import java.time.Year

fun sayHelloToJava(name: String) = println("Kotlin says hello to JAva and $name")


object Challenge {
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
//    @JvmStatic fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class EmployeeKt(val firstName: String, val lastName: String, var startYear: Int) {

    @JvmOverloads fun takesDefault(param1: String, param2: String = "default") = println("$param1 and $param2")
}

/*class EmployeeKt(val firstName: String, val lastName: String, @JvmField var startYear: Int) {

     fun takesDefault(param1: String, param2: String = "default") = println("$param1 and $param2")
}*/

