fun main() {
    // Tipos de datos comunes en Kotlin
    val v1: Int = 100
    val v2: Double = 1.0
    val v3: Boolean = true
    val v4: String = "Hello World"

    // "var" se utiliza para definir variables mutables, mientras que "val" se utiliza para definir variables cuyo valor no puede cambiar durante la ejecucion

    // La palabra clave Any permite declarar variables a las que se les puede reasignar valores de cualquier tipo
    var v5: Any = "Hello World"
    v5 = 10 // Se reasigna el valor de la variable declarada con Any a un valor de un tipo distinto
    println(v5)

    // La inferencia de tipo permite omitir el tipo de dato durante la definicion de la variable, siempre y cuando a la variable se le asigne un valor inicial
    var v6 = "Kotlin is fun"
    println(v6)
}