


/**
 * Representa un libro con su título, autor, número de páginas y calificación.
 * @property titulo El título del libro.
 * @property autor El autor del libro.
 * @property numPaginas El número de páginas del libro.
 * @property calificacion La calificación del libro, debe estar entre 0 y 10.
 */
class Libro(val titulo: String, val autor: String, val numPaginas: Int, var calificacion: Int) {

    init {
        require(calificacion in 0..10) {"La calificación debe estar entre 0 y 10."}
        require(numPaginas > 0) {"Un libro ha de tener páginas."}
    }

    /**
     * Retorna una representación en cadena del libro.
     * @return Una cadena que representa el libro.
     */
    override fun toString(): String {
        return "Título: $titulo\n - Autor: $autor\n - Páginas: $numPaginas\n - Calificación: $calificacion"
    }
}