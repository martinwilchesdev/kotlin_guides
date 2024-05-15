fun main() {
    /**
     * Las clases de datos no tienen ningun metodo que realice una accion.
     * Para definir una clase de datos se agrega la palabra clave `data` antes de la palabra clave `class`
     * */
    val q1 = DataClassName<Boolean>("What is?", true, "easy")
}

// Una clase de datos debe tener al menos un parametro en su constructor, y todos los parametros deben estar marcados con val o var.
data class DataClassName<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)
