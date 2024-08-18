package Zoologico

fun main() {
    println("Bienvenido al sistema de gestión de animales del zoológico!")

    val miZoologico = Zoologico(nombre = "Zoológico Nacional", largo = 500, ancho = 300)
    miZoologico.dimensiones()

    val zoologicoConservacion = Zoologico.Herencia(nombre = "Zoológico de Conservación", largo = 600, ancho = 400, enfoque = "especies en peligro")
    zoologicoConservacion.dimensiones()
    zoologicoConservacion.mostrarEnfoque()

    val leon = Leon()
    println("\nDetalles del león:")
    println("Especie: ${leon.especie}")
    leon.hacerSonido()

    val elefante = Elefante()
    println("\nDetalles del elefante:")
    println("Especie: ${elefante.especie}")
    elefante.hacerSonido()

    val animales = listOf(leon, elefante)
    println("\nAlimentando a los animales...")
    animales.forEach { animal ->
        println("Alimentando al ${animal.especie}:")
        animal.hacerSonido()
    }
}
