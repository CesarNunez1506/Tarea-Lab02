package Zoologico

abstract class Animal {
    abstract val especie: String
}

interface AccionAnimal {
    fun hacerSonido()
}

class Leon : Animal(), AccionAnimal {
    override val especie = "León"
    override fun hacerSonido() {
        println("Ruge ferozmente")
    }
}

class Elefante : Animal(), AccionAnimal {
    override val especie = "Elefante"
    override fun hacerSonido() {
        println("Emite un trompeteo")
    }
}
