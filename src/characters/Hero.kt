package characters

import world.Quest

class Hero(
    name: String ,
    val gender: String = "Неизвестный",
    val role: String ="Неизвестный",
    hp: Int = 0,
    var mp: Int = 0,
    val level: Int = 0,
    element: String = "Неизвестный",
    val experience: Int = 0
): GameCharacter(name,hp,element) {
    fun sayHello(){
        println("Я - $name, мой путь только начинается!")
    }
    fun showStats(){
        println("Имя: $name Класс: $role НР: $hp МР: $mp Уровень: $level Стихия: $element")
    }
    fun meditate(){
        println("$name медитрует...")
        mp+=20
        println("Мана восстановлена! Текущая мана: $mp")
    }
    fun takeDamage(amount: Int){
        println("$name получает $amount урон!")
        hp -= amount
        if (hp<0) {
            hp=0
        }
        println("Осталось здоровья: $hp")
        if (hp<=0){
            die()
        }
    }
    fun  castSpell(){
        repeat(times =10){
            if (mp <= 0){
                println("Мана равна 0, магия запрещена")
            }
            else{
                mp-=10
                println("Герой применяет магию Осталось: $mp")
            }
        }
    }
    fun heal(){
        if (mp <=0){
            println("Недостаточно маны! У вас только $mp")
        }
        else{
            hp+=10
            mp-=10
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
            println("Здоровье: $hp Мана: $mp")
        }
    }
    fun greet(name: String){
        println("Привет, $name!")
    }
    fun die(){
            println("Герой умер")
    }
    fun attack(enemy: Enemy, damage: Int){
        println("$name атакует врага ${enemy.name}")
        enemy.takeDamage(damage)
    }
    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int){
        println("$name использует заклинание '$spellName' против ${enemy.name}!")
        if (element == enemy.element){
            println("Стихии совпадают! Урон снижен.")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        }
        else {
            enemy.takeDamage(damage)
        }
        mp-=10
        if (mp<0) mp=0
        println("Осталось маны: $mp")
    }
    fun duel(opponent: Hero){
        println("Дуэль между $name и ${opponent.name} начинается!")
        println("$name атакует первым!")
        opponent.takeDamage(15)
        println("${opponent.name} отвечает!")
        this.takeDamage(15)
        println("Дуэль завершена")
        println("Состояние героев: ")
        this.showStats()
        opponent.showStats()
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "лёгкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }
        if (canAccept) {
            println("$name может принять квест «${quest.title}»!")
        } else {
            println("$name не может принять квест «${quest.title}. Требуется более высокий уровень.")
        }
        return canAccept
    }

}