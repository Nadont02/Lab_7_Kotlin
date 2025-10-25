package pets

class Bear(name: String) : Pet(name = name, speed = 200, maxHealth = 500) {
    val stenght: Int = 0
    override fun makeSounds() {
        println("Рычит громко")

    }

    override fun describe() {
        println("Огромный белый медведь. Здоровье $maxHealth")
    }
}