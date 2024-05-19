fun main() {
    /**
     * La funcion `fold` genera un valor unico a partir de una coleccion.
     * Generalmente se usa para calcular un total de precios o sumar todos los elementos de una lista.
     * */

    // La funcion `fold()` toma 2 parametros, un valor inicial y una expresion lambda en donde se ejucuta la logica del calculo.
    val sum = (1..10).fold(0) {total, number ->
        /**
         * La expresion lambda recibe 2 parametros:
         * - Un acumulador
         * - Una referencia del mismo tipo de cada elemento iterado de la coleccion
         * */
        total + number
    }
}