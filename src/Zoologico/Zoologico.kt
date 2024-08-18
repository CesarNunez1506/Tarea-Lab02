package Zoologico

open class Zoologico(val nombre: String, val largo: Int, val ancho: Int) {
    fun dimensiones() {
        println("Zoológico: $nombre")
        println("Dimensiones del hábitat: $largo m x $ancho m")
    }
    class Herencia(nombre: String, largo: Int, ancho: Int, val enfoque: String) : Zoologico(nombre, largo, ancho) {
        fun mostrarEnfoque() {
            println("Este zoológico se especializa en la conservación de: $enfoque")
        }
    }
}
