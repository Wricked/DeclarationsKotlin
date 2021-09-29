package academy.learnprogamming.challenge3

open class Bicycle(private var cadence: Int, private var speed: Int, private var gear : Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println(""" Bike is in gear $gear
        | with a cadence of $cadence
        | travelling at a speed of $speed.""".trimMargin())
}

class MountainBike(cadence: Int, speed: Int, gear : Int = 10, private var seatHeight: Int): Bicycle(cadence, speed, gear) {

    constructor(color: String, cadence: Int, speed: Int, gear: Int, seatHeight: Int) : this(cadence, speed, gear, seatHeight) {
        println("The color of mountain bike is: $color")
    }

    override fun printDescription() {
        super.printDescription()
        println(" The mountain bike has a seat height of $seatHeight inches.")
    }

    companion object {
        val availableColors = listOf("Blue", "Red", "White", "Black", "Green", "Brown")
    }
}

class RoadBike(private val tireWidth: Int, cadence: Int, speed: Int, gear : Int = 10): Bicycle(cadence, speed, gear){
    override fun printDescription() {
        super.printDescription()
        println(" The road bike has a tire width of $tireWidth mm.")
    }
}

fun main() {
    val bicycle = Bicycle(10,30,5)
    val mountainBike = MountainBike(5,20,10,5)
    val roadBike = RoadBike(15,40,7,20)

    bicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    val bicycle2 = Bicycle(10,30)
    val mountainBike2 = MountainBike(5,20, seatHeight = 5)
    val roadBike2 = RoadBike(20,40, 15)

    bicycle2.printDescription()
    mountainBike2.printDescription()
    roadBike2.printDescription()

    MountainBike("Black", 10,5,3,4)

    MountainBike.availableColors.forEach { println(it)}
}