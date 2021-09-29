package academy.learnprogamming.usesitevariance

fun main() {

    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1,cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1,fords2) // Generic types are invariant if function is only <Cars>.

    copyCars(fords1, cars2) // Type must be the same to copy.

    val cars3: MutableList<Car> = mutableListOf(Ford(), Ford())

}

// Function doesn't change the source (Covariance) and doesn't read the destination (Contravariance).
// When using in Function it's called Use Site Variance
fun<T: Car> copyCars(source: MutableList<out T>, destination: MutableList<in T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car {

}

class Toyota: Car() {

}

class Ford: Car() {

}

//List<? extends Car> <- Covariance = Accepts Car and everything that is subtype (reads).
//List<? super Car> <- Contravariance = Inverse as above (writes).