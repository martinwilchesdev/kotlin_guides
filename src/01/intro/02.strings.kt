fun main() {
    /**
     * La interpolacion permite incluir variables dentro de un string.
     * Las variables interpoladas deben iniciar con el caracter "$".
     * */
    val name = "Martin"
    val greeting = "Hello $name"
    println(greeting)

    // Mediante llaves "{}" es posible incluir expresiones de Kotlin dentro de un string
    println("Result: ${2 + 2}")

    // El operador "+" permite concatenar 2 o mas strings
    println("Hello " + "Martin")
}