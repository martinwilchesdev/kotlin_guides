fun main() {
    // Las propiedades y metodos del companion object pueden ser accedidas mediante el nombre de la clase que contiene dicho objeto
    println(CompanionClassName.total)
    println(CompanionClassName.answered)
}

enum class DifficultyClassName {
    EASY,
    HARD,
    MEDIUM
}

data class QuestionClassName<T>(
    val questionText: String,
    val answer: T,
    val difficulty: DifficultyClassName
)

class CompanionClassName {
    val q1 = QuestionClassName<String>("What is?", "true", DifficultyClassName.EASY)
    val q2 = QuestionClassName<Boolean>("What is?", true, DifficultyClassName.HARD)
    val q3 = QuestionClassName<Int>("What is?", 3, DifficultyClassName.MEDIUM)

    /**
     * Los objetos singleton se pueden definir dentro de otra clase por medio de un `companion object`.
     *      companion object [object name] {
     *          [object body]
     *      }
     * */
    companion object StudentProgressClassName {
        var total = 10
        var answered = 3
    }
}