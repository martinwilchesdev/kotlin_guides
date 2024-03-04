fun main() {
    /**
    * Las funciones con expresiones lambda tambien son conocidas como funciones anonimas
    * Son funciones que no tienen un nombre especifico y se definen en una sola linea de codigo
    */

    // En lugar de crear una funcion con nombre para calcular el area de un circulo, se podria crear una expresion lambda que haga lo mismo
    val calcularAreaCirculo = { radio: Double ->
        val pi = 3.14159265
        pi * radio * radio
    }

    // Las funciones lambda pueden ser pasadas como argumentos a otras funciones, se pueden almacenar en variables y se pueden usar como si fueran funciones regulares
    val radio = 4.0
    println(calcularAreaCirculo(radio)) // Se invoca a la funcion lambda a traves de la variable a la cual fue asignada
}