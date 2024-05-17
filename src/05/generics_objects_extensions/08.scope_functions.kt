fun main() {
    // Las funciones de alcance son funciones de orden superior que permiten acceder a las propiedades y metodos de un objeto sin hacer referencia al nombre del objeto.
    val q1 = ScopeFunctionsClassName()
    q1.printQuiz()

    /**
     * `apply()` es una funcion de extension a la que se puede llamar en un objeto con la notacion de punto ".".
     * Esta funcion muestra una referencia a ese objeto de modo que se pueda almacenar en una variable.
     * */
    ScopeFunctionsClassName().apply {
        // Dentro de la expresion lambda ya no es necesario hacer referencia a ningun objeto para invocar a la funcion de la clase
        printQuiz()
    }
}

enum class DifficultyScopeClassName {
    EASY,
    HARD,
    MEDIUM
}

data class QuestionScopeClassName<T>(
    val questionText: String,
    val answer: T,
    val difficulty: DifficultyScopeClassName
)

class ScopeFunctionsClassName {
    val q1 = QuestionScopeClassName<String>("what is?", "true", DifficultyScopeClassName.EASY)
    val q2 = QuestionScopeClassName<Boolean>("what is?", true, DifficultyScopeClassName.HARD)
    val q3 = QuestionScopeClassName<Int>("what is?", 1, DifficultyScopeClassName.MEDIUM)

    /**
     * Reemplazar los nombres de objetos largos mediante let().
     * La funcion `let()` permite hacer referencia a un objeto en una expresion lambda mediante el identificador `it` en lugar del nombre real del objeto.
     * `let()` es una funcion de extension a la que se puede llamar en cualquier objeto de Kotlin con la notacion de punto ".".
     * */
    fun printQuiz() {
        /**
         * El codigo que accede a las propiedades del objeto es encerrado en la lambda de la funcion `let()`.
         * El nombre de la variable `q1` es reemplazado por `it`
         * */
        q1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        q2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        q3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}