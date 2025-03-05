fun main() {
    val v1 = 1

    // `when` permite crear una estructura condicional compleja
    when(v1) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Numero no es valido")
    }
}