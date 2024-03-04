fun main() {
    // La sentencia "if" se utiliza para ejecutar un bloque de codigo si una determinada condicion se evalua como verdadera
    val v1: Boolean = true
    if (v1) {
        // Codigo que se ejecuta si la condicion es verdadera
    }

    // La condicion puede ser cualquier expresion que devuelva un valor booleano (verdadero o falso)
    // Se pueden utilizar operadores logicos y de comparacion para crear condiciones complejas

    // Tambien se puede utilizar la sentencia "else" para ejecutar un bloque de codigo cuando la condicion evaluada es falsa
    val v2: Boolean = false
    if (v2) {
        // Codigo que se ejecuta si la condicion es verdadera
    } else {
        // Codigo que se ejecuta si la condicion es falsa
    }

    // Kotlin tambien proporciona la sentencia "else if" para comprobar multiples condiciones
    if (!v1) {
        // Codigo que se ejecuta si la condicion es verdadera
    } else if (v2) {
        // Codigo que se ejecuta si la primera condicion es falsa y la segunda condicion es verdadera
    } else {
        // Codigo que se ejecuta si ambas condiciones son falsas
    }
}