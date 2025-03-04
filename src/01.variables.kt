fun main() {
    // Las variables pueden contener valores de distintos tipos
    // `var` permite definir variables a las cuales se les puede asignar un nuevo valor

    // String - Cadena de caracteres
    var nombre: String = "Martin"
    nombre = "Eduardo" // Reasignacion de una variable

    // Int - Numeros enteros
    var edad: Int = 10

    // Double - Numeros decimales de mayor precision
    var precio: Double = 10.33245645123

    // Float
    var precio_f: Float = 15.12f // El valor de las variables de tipo float finalizan con `f`

    /**
     * Inferencia de tipo
     * */
    var ciudad = "Bogota" // Kotlin infiere el tipo de dato de la variable a partir del valor recibido

    /**
     * Concatenacion de variables
     * */
    var v1 = "Hola"
    var v2 = " Mundo"
    println(v1 + v2) // El operador `+` permite concatenar 2 o mas strings

    /**
     * Constantes
     * */
    // Una constante es una variable cuyo valor no puede ser modificado
    // `val` permite definir variables de tipo constante
    val lang = "Kotlin"
}