package lessonTwo.duelGame

abstract class Weapon {
    abstract fun getDamage() : Int
}

class Hammer(): Weapon() {
    override fun getDamage(): Int = 25
}

class Daggers(): Weapon() {
    override fun getDamage(): Int = 50
}

class Bow(): Weapon() {
    override fun getDamage(): Int = 75
}
