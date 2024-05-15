fun main() {
    /**
     * La clase enum se usa para crear tipos con un conjunto limitado de valores posibles.
     ** En el mundo real los 4 puntos cardinales pueden estar representados por una clase enum. (NORTH, WEST, EAST, SOUTH)
     *      enum class [enum name] {
     *          [Case 1], [Case 2], [Case 3], ...
     *      }
     *
     * A cada valor posible de una clase enum se le conoce como constante enum.
     * - Las constantes enum se colocan dentro de las llaves, separadas por coma y cada una nombrada por mayusculas.
     *
     * Las constantes enum son referencidas mediante el operador "."
     *      [enum name].[case name]
     * */
    val q1 = EnumClassName<String>("What is?", "true", EnumCasesClassName.EASY)
}

enum class EnumCasesClassName {
    EASY,
    HARD,
    MEDIUM
}

class EnumClassName<T>(
    val questionText: String,
    val answer: T,
    val difficulty: EnumCasesClassName
)