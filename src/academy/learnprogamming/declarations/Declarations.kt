package academy.learnprogamming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    // val means is immutable
    // var is variable
    /*
    var number : Int
    number = 10
    number = 20

    val employee1 = Employee("Lynn Jones", 500)
    val employee2 = Employee("Mary", 1)
    val employee3 = Employee("John", 2)
    val employee4 = Employee("John", 2)
    val employee5 = employee4

    employee1.name = "Lynn Smith Jones"
    println(employee1)

    val change  = 4.22
    println("To show the value of change, we use \$change")
    println("Your change is $")

    val numerator = 10.99
    val denominator = 20.00

    println("The value of $numerator divided by $denominator is ${numerator/denominator}") // Division
    println("The employee's id is ${employee1.id}") // get value directly without needing to add + var

    val filePath = """c:\somedir\somedir2""" // raw strings*/
    val eggName = "Humpty"
    val nuseryRhyme = """$eggName Dumpty sat on the wall
        *$eggName Dumpty had a great fall
        *All the king's horses and all the king's men
        *Couldn't put $eggName together again.""".trimMargin("*")
    println(nuseryRhyme)
    /*
    val x = 0x0101010101
    val y = 0x0000111000

    var something : Any = employee4
    if(something is Employee) { // is instead of "elementsof"
        // val newEmployee = something as Employee // Cast
        something = employee1
        println(something.name)
    }
    *//*
    println(employee2 == employee3) // Same context inside class
    println(employee3 == employee4)
    println(employee2 === employee3) // Same Instance
    println(employee3 === employee4)
    println(employee2.equals(employee3)) // Same context inside class
    println(employee3.equals(employee4))
    println(employee4 === employee5)

    println(employee5 != employee3)
    println(employee5 !== employee3)
    println(employee3 != employee4)
    println(employee3 !== employee4)
    *//*
    employee1.name = "Lynn Jones Smith"

    val employee2 : Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }*/
}

class Employee (var name: String, val id : Int) {
    /*
    override fun equals(obj: Any?): Boolean { // There's no @ in annotations
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }
    */

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}