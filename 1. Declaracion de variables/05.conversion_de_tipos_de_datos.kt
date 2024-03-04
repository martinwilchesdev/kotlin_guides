fun main() {
    // En Kotlin se pueden convertir diferentes tipos de datos utilizando funciones especificas como toInt() o toString().
    // Estas funciones son metodos de extension que se pueden llamar en un objeto de un tipo especifico, para convertirlo a otro tipo.

    // Convertir un String a Int
    val v1: String = "123"
    val v2: Int = v1.toInt() // El valor convertido es almacenado en una nueva variable

    // Convertir un Double a Float
    val v3: Double = 3.14
    val v5: Float = v3.toFloat() // El valor convertido es almacenado en una nueva variable

    // Si el valor no es converetible, la funcion generara un NumberFormatException
    val v6: String = "abc"
    val v7: Int = v6.toInt() // NumberFormatException

    /**
    * Para evitar NumberFormatException al convertir tipos se pueden utilizar varias tecnicas:
    */

    // Comprobar si el valor es convertible antes de llamar a la funcion
    if (v6.isDigits()) { // La funcion isDigits() comprueba si una cadena contiene solo digitos numericos
        val v9: Int = v6.toInt()
    }

    if (v6.toIntOrNull()) { // La funcion toIntOrNull retorna null si valor no es convertible
        val v10: Int = v6.toInt()
    }

    // El bloque try...catch maneja la excepcion si no es posible realizar la conversion
    try {
        val v11: Int = v6.toInt()
    } catch() {
        println("La cadena no contiene solo numeros")
    }
}