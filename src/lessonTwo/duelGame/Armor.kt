package lessonTwo.duelGame

abstract class Armor {
    abstract var defense: Int
    abstract var durability: Int

    /**
     * @return вернет true если прочность брони пробита
     */
    fun reduceDurability(damage: Int): Boolean {
        val damageToDurability = damage / 25
        durability -= damageToDurability

        if (durability <= 0) {
            durability = 0
            return true
        }

        return false
    }
}

class HeavyArmor() : Armor() {
    override var defense = 75
    override var durability = 15
}

class MediumArmor() : Armor() {
    override var defense: Int = 50
    override var durability: Int = 10
}

class LowArmor() : Armor() {
    override var defense: Int = 25
    override var durability: Int = 5
}