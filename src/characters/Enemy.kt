package characters

class Enemy(
    name: String ,
    hp: Int = 0,
    element: String = "Неизвестный"
) : GameCharacter(name, hp , element ) {
    fun takeDamage(amount: Int){
        println("Герой $name получает $amount урон")
        hp-=amount
        if (hp<=0){
            hp = 0
        }
        println("Осталось здоровья: $hp")
    }
    fun isStrong(): Boolean{
        return  hp>100
    }
    fun getThreatLevel(): String {
        if (hp < 0) {
            return "Некорректное здоровье"
        }
        return when {
            hp <= 50 -> "Низкий"
            hp >= 150 -> "Средний"
            else -> "Высокий"
        }
    }
}