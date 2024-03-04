fun main() {
    // Cuando se utiliza el simbolo "$" se pueden insertar valores de variables dentro de la cadena
    val v1: String = "Karim"
    // Se inserta el valor de la variable v4 dentro de un nuevo String "Hola Karim"
    val v2: String = "Hola $v4"

    // Se pueden utilizar las llaves {} para insertar expresiones dentro de una cadena
    val v3: Int = 100
    val v4: String = "El numero es: ${v6 + 2}"
}