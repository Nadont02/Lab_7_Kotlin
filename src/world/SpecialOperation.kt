package world

class SpecialOperation (
    title: String,
    reward:Int,
    val requiredClearance: Int,
    val isConvert:Boolean
): Mission(title,reward){

    fun showReward(){
        println("Требуемый допуск:$requiredClearance")
        println("Ружим скрытности: ${if (isConvert) "Совершенно секретно" else "Обычный"}")
    }
}