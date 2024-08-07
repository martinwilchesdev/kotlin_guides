fun main() {
    /**
     * Los genericos permiten que una clase especifique un tipo de dato en principio desconocido, el cual se puede usar con sus propiedades y metodos.
     *      class [class name] <generic data type> {
     *          [properties]
     *      }
     *
     * El tipo de dato que utilizara eventualmente el tipo generico se pasa como parametro entre `<>` cuando se crea una instancia de la clase.
     *      val [instance name] = [class name]<generic data type>([parameters])
     *
     * El tipo de dato de la propiedad definido durante la instanciacion, debe coincider con el tipo de dato generico proporcionado para la clase.
     * */
    val q1 = GenericClassName<String>("What is?", "true","medium")
    val q2 = GenericClassName<Boolean>("What is?", true, "easy")
    val q3 = GenericClassName<Int>("What is?", 3, "hard")
}

class GenericClassName<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)