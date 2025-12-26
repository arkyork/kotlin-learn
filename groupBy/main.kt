@file:JvmName("Main")

// defining a class for Ramen
class Ramen(
    val flavor: String,
    val price: Double
)

// Creating a list of Ramen objects
val ramenMenu = listOf(
    Ramen("Shoyu", 8.5),
    Ramen("Miso", 9.0),
    Ramen("Tonkotsu", 10.0),
    Ramen("Shio", 8.0)
)

fun main(){
    // Using groupBy to categorize ramens by price range
    println("---- Ramen Menu Grouped by Price Range ----")
    val ramenByPrice = ramenMenu.groupBy { 
        when{
            it.price < 9.0 -> "Affordable"
            it.price <= 9.5 -> "Moderate"
            else -> "Expensive"
        }
    }
    for ((priceCategory, ramens) in ramenByPrice) {
        println("---- $priceCategory Ramen ----")
        for (ramen in ramens) {
            println("Ramen Flavor: ${ramen.flavor}, Price: $${ramen.price}")
        }
    }
}