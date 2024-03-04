fun main() {
    /**
    * Permiten agregar nuevas funcionalidades a una clase existente sin tener que heredar de ella o utilizar patrones de diseño como Decorator
    * Las funciones de extension son declaradas fuera de cualquier clase
    */

    // Se puede agregar una funcion llamada "duplicar" a la clase Int para duplicar un valor entero
    fun Int.duplicar(): Int {
        return this * 2 // La palabra clave this hace referencia al objeto que accede al metodo
    }

    // La funcion de extension "duplicar" puede ser utilizada con cualquier objeto de la clase Int
    val v1 = 5
    println(v1.duplicar())
}