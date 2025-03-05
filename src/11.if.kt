fun main() {
    // La estructura condicional if permite ejecutar un bloque de codigo si una condicion se cumple
    val age = 34
    val genre = "M"
    if (age === 18) {
        println("Tiene exactamente 18 años")
        if (genre === "M") {
            println("Le toca servicio obligatorio")
        } else {
            println("El servicio es opcional")
        }
    } else if (age > 18) {
        println("Es mayor de edad")
    } else {
        println("Es menor de edad")
    }
}