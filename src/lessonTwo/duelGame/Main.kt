package lessonTwo.duelGame

import kotlin.random.Random

/**
 * Задача 1: Игра дуэль
 * Напишите консольную игру, где игроки сражаются, по очереди бросая кубик. Всего в
 * игре может быть 3 класса (паладин, разбойник и лучник). У каждого класса должно
 * быть здоровье, броня и оружие. Оружие должно иметь собственный параметр атаки.
 * Броня имеет защиту, которая блокирует урон, но ее прочность снижается после
 * каждого блока. Игроки могут выбрать класс, за который они хотят играть.
 * Проигрывает тот, у кого первым кончилось здоровье.
 * • Паладин — много здоровья, слабая атака, тяжелая броня
 * • Разбойник — сильная атака, среднее количество здоровья, средняя броня
 * • Лучник — очень сильная атака, мало здоровья, легкая броня
 */
fun main() {
    val game = Game()
    val playerOne = game.createPlayer(1)
    val playerTwo = game.createPlayer(2)

    var step = 0
    while (playerOne.isAlive() && playerTwo.isAlive()) {
        val isMovePlayerOne = step % 2 == 0

        if (isMovePlayerOne) {
            println("Ходит игрок 1")
        } else {
            println("Ходит игрок 2")
        }
        println("Нажмите Enter для броска кубика")
        readLine()
        val roll = (1..6).random()
        println("Кубик: $roll")

        if (roll >= 3) {
            if (isMovePlayerOne) {
                playerTwo.takeDamage(playerOne.useWeapon())
            } else {
                playerOne.takeDamage(playerTwo.useWeapon())
            }
        } else {
            println("Атака не удалась, противник увернулся")
        }

        step++
    }

    println("--- ИГРА ОКОНЧЕНА ---")
    if (playerOne.isAlive()) {
        println("Победил игрок 1")
    } else {
        println("Победил игрок 2")
    }
}