package academy.learnprogamming.anotherpackage

import academy.learnprogamming.singleton.CompanyCommunications as Comm
import academy.learnprogamming.singleton.Department
import academy.learnprogamming.singleton.topLevel as OwO

fun main() {
    OwO("${academy.learnprogamming.singleton.main()}")
    println(Comm.getCopyrightLine())
    println(Department.IT.getDeptInfo())
}