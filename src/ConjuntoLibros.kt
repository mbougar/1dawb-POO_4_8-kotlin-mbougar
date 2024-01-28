

/**
 * ConjuntoLibros representa un conjunto de libros.
 */
class ConjuntoLibros() {

    private var libros = arrayOfNulls<Libro>(5)

    /**
     * Agrega un libro al conjunto.
     * @param libro El libro a agregar.
     * @return true si se agregó el libro correctamente, false si el libro ya está presente o el conjunto está lleno.
     */
    fun agregarLibro(libro: Libro): Boolean {

        if (libro !in libros) {

            for (indice in libros.indices) {

                if (libros[indice] == null) {

                    libros[indice] = libro
                    return true
                }
            }
        }
        return false
    }

    /**
     * Elimina un libro del conjunto por su título.
     * @param titulo El título del libro a eliminar.
     */
    fun eliminarLibroPorTitulo(titulo: String) {

        libros.forEachIndexed { indice, libro ->
            if (libro?.titulo == titulo) {

                libros[indice] = null
            }
        }
    }

    /**
     * Elimina un libro del conjunto por su autor.
     * @param autor El autor del libro a eliminar.
     */
    fun eliminarLibroPorAutor(autor: String) {

        libros.forEachIndexed { indice, libro ->
            if (libro?.autor == autor) {

                libros[indice] = null
            }
        }
    }

    /**
     * Ordena los libros de mayor a menor calificación.
     */
    fun ordenarLibrosMayorAMenor() {
        libros= libros.sortedByDescending { it?.calificacion }.toTypedArray()
    }

    /**
     * Ordena los libros de menor a mayor calificación.
     */
    fun ordenarLibrosMenorAMayor() {
        libros= libros.sortedBy { it?.calificacion }.toTypedArray()
    }

    /**
     * Retorna una representación en cadena del conjunto de libros.
     * @return Una cadena que representa los libros presentes en el conjunto.
     */
    override fun toString(): String {
        return ("Libros:\n${libros.filterNotNull().joinToString("\n")}")
    }
}
