package academy.learnprogamming.iokotlin

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main() {

    val di = DataInputStream(FileInputStream("TestFile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {

    }
}