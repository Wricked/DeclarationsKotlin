package academy.learnprogamming.lambda

import java.time.Year

fun main() {
    //run { println("I'm in lambda!")}
    val employees = listOf(Employee("John", "Smith", 2012), Employee("Jane", "Wilson", 2015), Employee("Marry", "Johnson", 2010), Employee("Mike", "Jones", 2002))
    println(employees.minByOrNull { s -> s.startYear })
    println(employees.minByOrNull { it.startYear })
    println(employees.minByOrNull(Employee::startYear))

    var num = 10
    run {
        num += 15
        println(num)
        topLevel() // Call Functions
    }
    run(::topLevel)
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)

fun topLevel() = println("I'm a function!")

fun useParameter(employee: List<Employee>, num: Int) {
    employee.forEach {
        println(it.firstName)
        println(num)
    }
}