package pets

fun main() {
//    val wolf = Wolf()
//    print(wolf.packSize)
    val pets = listOf(
        Wolf(name = "Безумно можно быть первым"),
        Cat(name = "Батон"),
        Eagle(name = "Орьёль"),
        Bear(name = "Косолапый")
    )
    for (pet in pets){
        pet.describe()
        pet.makeSounds()
        println()
    }
}