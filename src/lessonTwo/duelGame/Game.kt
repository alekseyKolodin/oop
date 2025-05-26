package lessonTwo.duelGame

class Game {

    fun createPlayer(number: Int): Player {
        println("Игрок $number выберите персонажа:")
        println("1) Паладин")
        println("2) Разбойник")
        println("3) Лучник")
        val value = readLine()?.toInt() ?: 1
        return when (value) {
            1 -> Paladin()
            2 -> Robber()
            3 -> Archer()
            else -> Paladin()
        }
    }
}