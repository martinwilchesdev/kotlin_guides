fun main() {
    /**
    * La sentencia where en Kotlin es similar a la sentencia switch en otros lenguajes de programacion.
    * Se utiliza para evaluar una expresion y ejecutar un bloque de codigo correspondiente a uno de los varios posibles valores
    */
    val v1: Int = 3
    when(v1) {
        1 -> {
            // Codigo que se ejecuta si la expresion es igual a 1
        }
        3 -> {
            // Codigo que se ejecuta si la expresion es igual a 3
        }
        else -> {
            // Codigo que se ejecuta si la expresion no coincide con ningun valor
        }
    }
}