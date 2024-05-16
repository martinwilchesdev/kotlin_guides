fun main() {
    /**
     * Un singleton es una clase que solo puede tener una unica instancia.
     * La sintaxis de los singleton es similar a una clase, en lugar de usar la palabra clave `class` se usa `object`.
     *      object [object name] {
     *          [class body]
     *      }
     *
     * Los singleton no tienen un constructor, ya que no se pueden crear instancias directamente.
     * Todas las propiedades se definen entre "{}" y reciben un valor inicial.
     *
     * Las propiedades del singleton son son accedidas haciendo referencia al nombre del objeto, seguido del operador "." y el nombre de la propiedad
     *      [object name].[property name]
     * */
    println("${SingletonClassName.answered} of ${SingletonClassName.total} asnwered")
}

// Objecto singleton para llevar registro de la cantidad total de preguntas y de la cantidad de preguntas respondidas en un cuestionario
object SingletonClassName {
    var total = 10 // 10 preguntas en total contiene el cuestionario
    var answered = 3 // 3 preguntas del cuestionario han sido respondidas
}