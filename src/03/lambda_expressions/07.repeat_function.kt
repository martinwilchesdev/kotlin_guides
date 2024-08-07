fun main() {
    /**
     * Las funciones que muestran otras funciones o reciben funciones como parametros se denominan funciones de orden superior.
     *
     * La funcion "repeat()" es una funcion de orden superior que representa una forma concisa de expresar un bucle for
     *      repeat(times: Int, action: (Int) -> Unit)
     *
     * - times es la cantidad de veces que debe ocurrir la accion.
     * - action es una funcion que toma un solo parametro el cual es la cantidad de veces que se ejecuto la accion hasta el momento.
     * */
    repeat(10) {
        println(it + 1)
    }
}