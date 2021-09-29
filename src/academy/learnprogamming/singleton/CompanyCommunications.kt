package academy.learnprogamming.singleton

import java.time.Year

fun main() {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("This is string as is.")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    // Function that requires a Class with SomeInterface. As parameter, it is created an anonymous object instance to act with SomeInterface Interface and overrides that Interface function with a String multiplying by 100.
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int) = "This is from mustImplement: ${num * 100}"
    })
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable ++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)

    println(Department.IT.getDeptInfo())
}

fun topLevel(str: String) = println("Top level function: $str")

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20); // Only use case that requires semi colon ";"

    fun getDeptInfo() = "The $fullName department has $numEmployees employees."
}

// Object keyword means that Class is a unique instance Class per application.
object CompanyCommunications {
    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All Rights reserved."
    // Internal is function that only the module can use it.
}

class SomeClass(val someString: String) {
    // Acts as unique instance like in java (the "static" keyword). It doesn't need to create instance to access it.
    // Companion Objects are Singleton Objects are properties and functions that are NOT tied to the instance of the class. So it can be called without initializing the Class+.
    companion object {
        private var privateVar = 6 // Private final in Java.

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"
        fun justAssign(str: String): SomeClass = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            return if(lowerCase) {
                SomeClass(str.lowercase())
            } else {
                SomeClass(str.uppercase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int) : String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantSomeInterface ${si.mustImplement(20)}")
}