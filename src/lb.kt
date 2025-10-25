import com.sun.jdi.ClassType
import com.sun.source.util.Plugin
import org.w3c.dom.Text
import kotlin.math.round
import kotlin.random.Random

//fun main() {
//    val board = Array(size = 3){Array(size = 3){' '} }
//    var currentPlayer = 'X'
//    var moves = 0
//    println("Крестики-нолики: Ты (Х) против Компьютера (0)")
//    printBoard(board)
//    while (true) {
//        if (currentPlayer == 'X') {
//            println("твой ход, введите строку и столбец(0,1 или 2):")
//            val row = readln().toInt()
//            val col = readln().toInt()
//            if (row !in 0..2 || col !in 0..2) {
//                println("неверные координаты, должны быть 0,1 или 2")
//                continue
//            }
//            if (board[row][col] != ' ') {
//                println("ячейка уже занята, попробуй снова")
//                continue
//            }
//            board[row][col] = currentPlayer
//        } else{
//            println("Ход компьютера:")
//            val (row, col) = getComputerMove(board)
//            println("комп выбрал: $row $col")
//            board[row][col] = currentPlayer
//        }
//        moves++
//        printBoard(board)
//    }
//    val hello:() -> Unit = { println("hello") }
//    hello()
//    attack("Goblin")
//    val nums = listOf(1,2,3,4,5)
//    val doubled = nums.map{it*2}
//    println(doubled)
//    val nums2 = listOf(15,22,35,48,51, 10)
//    val doubled2 = nums.map{it%2 == 0}
//    println(doubled2)
//    val doubled3 = nums.filter{it%2 == 0}
//    println(doubled3)
//    applyEffect { it+50 }
//    val kills = createCounter()
//    println(kills())
//    println(kills())

//    greetPlayer()
//    showChatMessage(text="добрый день")
//    createCharacter(name="Вика", level = 15)
//    createCharacter(name="полина", level = 15, classType = "маг" )
//    val damage = calculateDamage(baseDamage = 150, multiplier = 1.5 )
//    println("нанесен урон: $damage HP")
//    println(sum(a=10, b=15))
//    val sum = fun(x: Int,y: Int): Int=x+y
//    println(sum)
//    println(
//        fun(a:Int, b: Int): Int {
//            return a+b
//        }
//            (10,20)
//    )
//}
//fun printBoard(board: Array<Array<Char>>){
//    println(" 0 1 2")
//    for (i in board.indices){
//        print("$i")
//        println(board[i].joinToString(separator = "|") {if (it==' ') "_" else it.toString()} )
//    }
//    println()
//}
//fun checkWin(board: Array<Array<Char>>, player: Char): Boolean {
//    for (i in 0..2) {
//        if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
//            return true
//        }
//        if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
//            return true
//        }
//        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
//            return true
//        }
//        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
//            return true
//        }
//        return false
//    }}
//    fun getComputerMove(board: Array<Array<Char>>): Pair<Int, Int> {
//        val emptyCells = mutableListOf<Pair<Int, Int>>()
//        for (i in 0..2) {
//            for (j in 0..2) {
//                if (board[i][j] == ' ') {
//                    emptyCells.add(Pair(i, j))
//                }
//            }
//        }
//        return emptyCells[Random.nextInt(emptyCells.size)]
//    }

//fun createCounter():()->Int{
//    var count = 0
//    return {++count}
//}
//fun applyEffect(effect:(Int)-> Int){
//    val health = 100
//    println("new health: ${effect(health)}")
//}
//val sum1 = fun(x: Int,y:Int): Int{
//    return x+y
//}
//val sum2 = fun(x: Int,y:Int): Int=x+y
//val sum3 = {x:Int, y:Int -> x+y}
//val sum4:(Int,Int)->Int = {x,y->x+y}
//val attack={enemy: String -> println("атакован $enemy")}
//val greet = fun(name: String){
//    println("$name")
//}
//fun greetPlayer() = println("привет игрок")
//fun showChatMessage(text: String){
//    println(text)
//}
//fun showPlayerStats(name: String, health: Int){
//    println("игрок $name| здоровье $health")
//}
//fun createCharacter(name: String, level: Int=1, classType: String = "новичок"){
//    println("игрок: $name | уроыень: $level | класс: $classType")
//}
//fun calculateDamage(baseDamage: Int, multiplier: Double): Int{
//    return (baseDamage*multiplier).toInt()
//}
//fun ShowMessage(text: String){
//    println(text)
//}
//fun sum(a:Int, b:Int):Int=a+b
//fun sum(a:Double, b:Double):Double=a+b


