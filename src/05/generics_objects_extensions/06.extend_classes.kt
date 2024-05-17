fun main() {
    /**
     * Kotlin permite que se puedan agregar propiedades y metodos a los tipos de datos existentes.
     * Para agregar una propiedad de extension, se agrega el nombre del tipo y un operador de punto "." , seguido del nombre de la propiedad.
     *      val [type name].[property name]: [data type]
     *          [property getter]
     *
     * Para definir una funcion de extension, se agrega el nombre del tipo y un operador de punto antes del nombre de la funcion.
     *      fun [type name].[function name]([parameters]): [return type] {
     *          [function body]
     *      }
     * */

    /**
     * Las propiedades de extension no pueden almacenar datos, por lo que deben ser de solo acceso.
     * "progressText" al ser una propiedad de extension del companion object, se puede acceder a esta directamente desde la clase que contiene dicho objeto.
     * */
    println(ExtendClassName.progressText)
    ExtendClassName.printProgressBar()
}

class ExtendClassName {
    companion object StudentProgress {
        var total = 10
        var answered = 3
    }
}

val ExtendClassName.StudentProgress.progressText: String
    get() = "$answered of $total"

fun ExtendClassName.StudentProgress.printProgressBar() {
    repeat(answered) {
        print("▓")
    }
    repeat(total - answered) {
        print("▒")
    }
}