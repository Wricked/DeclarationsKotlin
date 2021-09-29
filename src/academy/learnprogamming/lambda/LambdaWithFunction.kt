package academy.learnprogamming.lambda

fun main() {
    val employees = listOf(Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Marry", "Johnson", 2010),
        Employee("Mike", "Jones", 2002))

    println(countTo100())
    println(countTo100v2())
    println(countTo100v3())
    findByLastName(employees, "Jones")
    findByLastName(employees, "Smighsh")
    findByLastNamev2(employees, "Jones")
    findByLastNamev2(employees, "Smighsh")

    "Some String".apply apply1@{
        "Another String".apply {
            println(lowercase())
            println(this@apply1.uppercase())
        }
    }
}

fun findByLastName(employees : List<Employee>, lastName: String) {
    for (employee in employees) {
        if(employee.lastName == lastName) {
            return println("The employee last name  $lastName.")
        }
    }
    return println("There's no employee with last name $lastName.")
}

fun findByLastNamev2(employees : List<Employee>, lastName: String) {
    employees.forEach returnBlock@ { employee ->
        if(employee.lastName == lastName) {
            return@returnBlock println("The employee last name  $lastName.")
            // @returnBlock Only returns from the Lambda (forEach), not the function.
        }
    }
    return println("There's no employee with last name $lastName.")
}

fun countTo100() : String { // 1, 2, 3, 4, ...
    val numbers = StringBuilder()
    for (i in 1..99){
        numbers.append(i)
        numbers.append(", ")
    }
    return numbers.append(100).toString()
}

fun countTo100v2() = with(StringBuilder()) { // 1, 2, 3, 4, ...
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100).toString()
}

fun countTo100v3() = StringBuilder().apply { // 1, 2, 3, 4, ...
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100).toString()
}