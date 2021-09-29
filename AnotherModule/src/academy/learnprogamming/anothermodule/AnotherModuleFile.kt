package academy.learnprogamming.anothermodule

import academy.learnprogamming.singleton.topLevel
import academy.learnprogamming.functions.upperFirstAndLast as formatting

fun main() { // Module dependency from DeclarationsKotlin. F4, dependencies and select the project.
    topLevel("Hey.")
    println("Some String.".formatting())
}