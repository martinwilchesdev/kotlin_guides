fun main() {
    // Tipos de datos comunes en Kotlin
    val v1: Int = 100
    val v2: Double = 1.0
    val v3: Boolean = true
    val v4: String = "Hello World"

    // La palabra clave Any permite declarar variables a las que se les puede reasignar valores de cualquier tipo
    var v5: Any = "Hello World"
    v5 = 10 // Se reasigna el valor de la variable declarada con Any a un valor de un tipo distinto
    println(v5)
}