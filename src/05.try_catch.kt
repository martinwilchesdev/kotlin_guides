fun main() {
    try {
        // El bloque `try` intenta ejecutar el bloque de codigo
        println("Escribe el primer valor")
        val v1 = readln().toDouble()
        println("Escribe el segundo valor")
        val v2 = readln().toDouble()

        println(v1  + v2)
    } catch (e: NumberFormatException) {
        // El bloque `catch` captura los errores provocados en el bloque `try`
        println("Escribe un numero valido")
    }
}