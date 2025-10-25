package pets

class Cat(name: String) : Pet(name = name, speed = 400, maxHealth = 50) {
    val stealLevel: Int = 0
    override fun makeSounds(){
        println("$name мяукает.")
    }

    override fun describe() {
        super.describe()
    }
}