data class Jugador(
    val nombre: String,
    val anioNacimiento: String,
    val fotoResId: Int // Cambiado a Int para usar recursos de drawable
) {
    val edad: Int
        get() = 2023 - anioNacimiento.toInt() // Calcula la edad
}