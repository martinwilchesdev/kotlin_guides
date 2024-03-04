fun main() {
    /**
    * Las funciones pueden tener parametros de tipo generico, lo que significa que pueden aceptar argumentos de cualquier tipo
    * Los tipos genericos se indican con una o mas variables de tipo entre corchetes "<>"
    */

    // La funcion intercambiar recibe 2 parametros de tipo generico "T", que pueden ser de cualquier tipo especificado al momento de invocar la funcion
    fun <T> intercambiador(v1: T, v2: T): Pair<T,T> {
        return Pair(v2,v1)
    }

    // La funcion intercambiar puede ser invocada con 2 argumentos de cualquier tipo
    val v1: Int = 10
    val v2: Int = 20
    val (v3,v4) = intercambiador(v1, v2)
    println("El nuevo valor de v1 es ${v3} - El nuevo valor de v2 es ${v4}")

    data class Persona(var nombre: String, var edad: Int) // La palabra clave data que antecede la definicion de la clase permite que esta sea trabajada como un modelo de datos
    var p1: Persona = Persona("Karim", 20)
    var p2: Persona = Persona("Ada", 30)
    val (p3, p4) = intercambiador(p1, p2)
    println("Persona 1 - Nombre ${p3.nombre}, Edad ${p3.edad} | Persona 2 - Nombre ${p4.nombre}, Edad ${p4.edad}")
}