package magic

class Spell (
     name: String,
    val width: Int = 0,
    val height: Int = 0,
     symbol: String
): MagicEffect(name,symbol,duration=10){
    fun cast() {
        println("Кастуем $name!")
        repeat(times = height) {
            repeat(times = width) {
                print(symbol)
            }
            println()
        }
    }
    constructor(name: String, size: Int, symbol: String) : this(name, width = size, height = size, symbol)
    fun area(): Int {
        return width * height
    }
    fun description(): String{
        return "Заклинание $name занимает область $width x $height и испольузет символ $symbol"
    }
}