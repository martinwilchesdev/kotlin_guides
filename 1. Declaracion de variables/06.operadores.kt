fun main() {
    /**
    * Operadores de signo
        + : Identidad, especifica el valor es positivo o cero
        - : Negacion, cambiar el signo de un valor a negativo o cero
    */
    val v1: Int = 5
    val v2: Int = -10
    println(-v1) // -5
    println(-v2) // 10

    /**
    * Operadores aritmeticos
    */
    val v3: Int = 5
    val v4: Int = 3
    println(v3 + v4) // Suma
    println(v3 - v4) // Resta
    println(v3 * v4) // Multiplicacion
    println(v3 / v4) // Division
    println(v3 % v4) // Modulo

    // Existen ademas los operadores aritmeticos de asignacion, los cuales permite realizar una operacion matematica y asignar el resultado a una variable en una sola linea de codigo
    var v5: Int = 10
    v5 += 100 // 110
    v5 -= 3 // 7
    v5 *= 2 // 100
    v5 /= 5 // 2
    v5 %= 3 // 1

    /**
    * Operadores de incremento y decremento
        Son utilizados para aumentar o disminuir el valor de una variable en una unidad
    */
    var v6: Int = 10
    v6++ // 11
    v6-- // 10

    /**
    * Operadores relacionales
        Son utilizados para comparar valores y determinar si son iguales o diferentes
    */
    val v7: Int = 5
    val v8: Int = 3
    println(v7 == v8) // igual
    println(v7 != v8) // diferente
    println(v7 > v8) // Mayor que
    println(v7 < v8) // Menor que
    println(v7 >= v8) // Mayor o igual que
    println(v7 <= v8) // Menor o igual que

    /**
    * Operadores logicos
        Son utilizados para crear expresiones logicas que pueden ser evaluadas como verdaderas o falsas
    */
    val v9: Int = 1
    val v10: Int = 5
    val v11: Int = 3
    println(v9 < v10 && v11 == 3) // and
    println(v9 == 2 || v11 > 1) // or
    println(!(v9 > 100)) // not
}