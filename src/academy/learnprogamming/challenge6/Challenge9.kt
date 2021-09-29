package academy.learnprogamming.challenge6

fun main() {
    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones"
    employee.salaryLast3Years = arrayOf(50000.25f, 54000.60f, 568000.75f).toFloatArray()

}

