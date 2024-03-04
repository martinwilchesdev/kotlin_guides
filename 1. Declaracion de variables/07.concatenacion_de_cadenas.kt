fun main() {
    // En Kotlin la concatenacion de cadenas se puede realizar mediante el operador "+" o el simbolo "$"

    // Cuando se utiliza el operador "+" se concatenan 2 o mas cadenas y se devuelve una nueva cadena como resultado
    val v1: String = "Hola"
    val v2: String = " Mundo"
    // Se concatenan los valores de las variables anteriores en un solo string "Hola Mundo"
    val v3 = v1 + v2

    // Cuando se utiliza el simbolo "$" se pueden insertar valores de variables dentro de la cadena
    val v4: String = "Karim"
    // Se inserta el valor de la variable v4 dentro de un nuevo String "Hola Karim"
    val v5: String = "Hola $v4"

    // Se pueden utilizar las llaves {} para insertar expresiones dentro de una cadena
    val v6: Int = 100
    val v7: String = "El numero es: ${v6 + 2}"
}