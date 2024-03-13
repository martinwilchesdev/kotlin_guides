fun main() {
    // Los rangos representan un intervalo de valores enteros, declarados mediante el operador ..
    val v1: IntRange = 1..100
    for (i in v1) {
        println(i)
    }

    // Al definir un condicion if, la expresion evaluada puede ser un rango de valores
    val v2: Int = 20
    if (v2 in 10<=..<=99) {
        println(v2)
    }
}