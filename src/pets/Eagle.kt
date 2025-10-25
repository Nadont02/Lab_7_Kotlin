package pets

class Eagle(name: String) : Pet(name = name, speed = 300, maxHealth = 25) {
    val flightHeight: Int = 0
    override fun makeSounds() {
        println("Орёл")
    }
}