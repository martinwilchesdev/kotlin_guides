fun main() {
    // cambio del tipo de dato de una variable
    val v1 = 5
    val v2 = "10"
    val res = v1 + v2.toInt() // Convertir una variable de tipo string a int
    println(res)

    val v3 = 20
    println(v3.toString()) // Convertir una variable de tipo int a string

    /**
     * Concatenacion de strings
     * */
    val v4 = "Hola"
    val v5 = "Mundo"
    println(v4 + v5) // Concatenacion de strings usando el operador `+`
    println("$v4, $v5") // Concatenacion mediante inyeccion de variables en un string
}