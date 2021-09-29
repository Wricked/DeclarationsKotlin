package academy.learnprogamming.covariance

fun main() {

    val flowerTender = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) {
            println("I'm pruning a ${flower.name}!")
        }
    } // Generic type to work on all types of flowers.

    //val roseTender = object: FlowerCare<Rose> {
    //    override fun prune(flower: Flower) = println("I'm pruning a rose!")
    //}

    val roseGarden = Garden2<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

    // Created a roseTender val overriding the function of interface FlowerCare anonymously, then we created a Class of Garden2 with 2 Class Rose and a prune function now called roseTender, then we called the function tendFlower from Garden2 object from the first Class Rose of roseGarden.

    //val daffodilTender = object: FlowerCare<Daffodil> {
    //    override fun prune(flower: Flower) = println("I'm pruning a daffodil!")
    //} // Don't need them anymore as we are using contravariance on Interface to in position.

    val daffodilGarden = Garden2<Daffodil>(listOf(Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(0)
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) { // Only accepts Flower, not Rose.

}

class Garden2<T: Flower> (val flowers: List<T>, val flowerCare: FlowerCare<T>) { // T is a generic type who accepts all kind of Flowers (Daffodil and Rose).
    fun pickflower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

class Daffodil : Flower("Daffodil") {

}

open class Flower (val name: String) {

}

class Rose: Flower("Flower") {

}

interface FlowerCare<in T> { // Contravariance, which is opposite of variance.
    fun prune(flower: Flower)
    //fun pick(): T
}

// Variance looks down to the hierarchy, and Contravariance looks up to the hierarchy.