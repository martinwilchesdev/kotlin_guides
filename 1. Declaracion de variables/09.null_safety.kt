fun main() {
    /**
    * El null safety es una caracteristica de Kotlin que previente errores debido a la asignacion o uso de valores nulos en una aplicaicon.
    * Por defecto en Kotlin todas las variables deben tener un valor asignado al ser declaradas.
    * Si se quiere permitir que una variable pueda tener un valor nulo, se debe declarar explicitamente utilizando el operador ?.
    */
    val v1: String = "Karim" // No puede ser nulo
    var v2: String? = "Jon" // Puede ser nulo
    v2 = null

    // Para acceder a un valor que puede ser nulo, se deben utilizar los operadores "?" o "?:"
    println(v2?.lenght) // El operador ? se utiliza para acceder a una propiedad o llamar a un metodo en un objeto que puede ser nulo, retornando null si el objeto es null
    var v4: String? = v2?: "Ada" // El operador ?: se utiliza para proporcionar un valor por defecto si el valor es null
}