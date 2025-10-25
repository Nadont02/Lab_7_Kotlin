package magic

fun main() {
    val fireball = Spell(
        name = "Огненный шар",
        width = 3,
        height = 3,
        symbol = "\uD83D\uDD25"
    )
    val heal = InstantSpell(
        name = "Лечение",
        symbol = "\uD83D\uDC9A",
        power = 5
    )
    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}
