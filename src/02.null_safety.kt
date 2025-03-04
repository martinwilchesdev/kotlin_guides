fun main() {
    // null safety // valores opcionales
    var v1: String? = null // El simbolo `?` indica que la variable puede o no tener un valor
    v1 = "Kotlin" // El valor de la variable inicialmente nula puede reasignarse por un string

    // Si la variable `v1` tiene un valor distinto a nulo, se ejecuta el codigo dentro del bloque `let`
    v1?.let {
        println("tiene valor")
    }
}