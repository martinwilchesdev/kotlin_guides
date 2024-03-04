fun main() {
    // En Kotlin la palabra clave "Any" se utiliza para declarar una variable que puede contener cualquier tipo de valor
    val v1: Any = "Hola Mundo"
    v1 = 10 // La variable v1 es iniciada como una cadena pero luego se le asigna un valor numerico

    // La palabra clave "Any?" se utiliza para declarar una variable que puede contener cualquier tipo de valor y tambien puede ser nula
    val v2: Any? = null
}