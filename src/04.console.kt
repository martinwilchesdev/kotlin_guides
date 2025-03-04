fun main() {
    println("Escribe el primer valor")
    val v1 = readln() // El metodo `readln()` permite que el usuario ingrese un valor por consola
    println("Escribe el segundo valor")
    val v2 = readln()

    // `readln()` siempre espera un string como entrada
    println(v1.toInt() + v2.toInt()) // Se realiza la conversion del tipo de dato para poder realizar la suma de enteros
}