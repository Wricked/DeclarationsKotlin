package academy.learnprogamming.iokotlin

import java.io.File

fun main() {
    val reader = File("TestFile.txt").reader()
    val lines = reader.readText()
    val lines2 = File("TestFile.txt").reader().use { it.readText() }
    val lines3 = File("TestFile.txt").bufferedReader().use { it.readText() }
    val lines4 = File("TestFile.txt").readText()
    val lines5 = File("TestFile.txt").reader().forEachLine { println(it) }
    val lines6 = File("TestFile.txt").reader().useLines { it -> it.forEach { println(it) } }
    println(lines)
    println(lines2)
    println(lines3)
    println(lines4)
    reader.close()
    // Same as New InputSteamReader(new FileInputStreamReader(newFile("TestFile.txt")), "UTF-8")


}