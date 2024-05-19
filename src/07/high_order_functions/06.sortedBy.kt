fun main() {
    // La funcion `sortedBy()` permite especificar una expresion lambda en la cual se muestra la propiedad sobre la cual se quiere realizar el ordenamiento.
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
}