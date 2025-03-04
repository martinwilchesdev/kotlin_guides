fun main() {
    /**
     * Listas inmutables
     * */
    var v1 = listOf(1,2,3,4,5) // La lista no puede ser modificada, solo se podra acceder a sus elementos
    println(v1)
    println(v1[0])

    /**
     * Listas mutables
     * */
    var v2 = mutableListOf(1,2,3,4,5) // La lista puede ser modificada al igual que sucede con los arrays
    v2 += 100
    println(v2)

    v2.remove(3) // Eliminar un elemento de la lista
    println(v2)
}