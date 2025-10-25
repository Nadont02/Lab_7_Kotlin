package world

class Quest(
     title: String,
    val duration: Int,
     reward: Int,
    val difficulty: String
) : Mission(title,reward){
    fun printInfo(){
        println("Название квеста: ${this.title} Время выолнения: ${this.duration} Награда:  ${this.reward} золотых Уровень сложности: ${this.difficulty}")
    }
    fun isHard(): Boolean{
        return difficulty=="Сложный"
    }
    fun goldPerHour(): Int {
        require(value = duration >= 0 && reward >= 0) {"Длительность и награда не могут быть отрицательными!" }
        if (duration == 0) return 0
        return reward / duration
    }
}