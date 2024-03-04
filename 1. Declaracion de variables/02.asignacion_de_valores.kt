fun main() {
    // La asignacion de valores se realiza mediante el operador "="
    var v1 = 5
    // Reasignacion de valor a una variable existente
    v1 = 10

    // Kotlin admite el uso de "destructuring declarations" para asignar varios valores a varias variables en una sola linea de codigo
    var (v2,v3) = Pair(10,22)

    // Asignacion del valor de una variable a otra variable distinta
    var v4 = v2 // Se asigna el valor de v2 a v4

    // En Kotlin es importante especificar el tipo de dato que puede recibir una variable y su valor al mismo tiempo
    val v5: String = "Karim"
}