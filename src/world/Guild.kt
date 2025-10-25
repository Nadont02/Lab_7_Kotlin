package world

fun main() {
    val quest = Quest(title = "Поиск артефакта", duration = 3, reward = 800, difficulty = "Средний")

    val contract = Contract(title = "Защита каравана",
        clientName = "Гильдия купцов",
        taskDescription = "Охрана груза", reward = 1200)

    val specialOp = SpecialOperation(title = "Операция 'Тень'",
        reward = 2560, requiredClearance = 2, isConvert = true)

    println("Информация о квесте:")
    println("Название: ${quest.title}, Награда: ${quest.reward}")

    println("\nИнформация о контракте:")
    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")

    println("\nИнформация о спецоперации:")
    println("Название: ${specialOp.title}")
    specialOp.showReward()
}