

fun main() {

    val conjuntoLibros = ConjuntoLibros()
    conjuntoLibros.agregarLibro(Libro("Meditaciones", "Marco Aurelio", 256, 10))
    conjuntoLibros.agregarLibro(Libro("La Larga Marcha", "Stephen King", 352, 9))

    println(conjuntoLibros)
    println("\n*************\n")

    conjuntoLibros.eliminarLibroPorTitulo("Meditaciones")
    println(conjuntoLibros)
    println("\n*************\n")

    conjuntoLibros.eliminarLibroPorAutor("Stephen King")
    println(conjuntoLibros)
    println("\n*************\n")

    println("Añadiendo libros...\n")
    conjuntoLibros.agregarLibro(Libro("El Cuervo", "Edgar Allan Poe", 72, 7))
    conjuntoLibros.agregarLibro(Libro("The Flaw of Averages", "Sam L. Savage", 519, 8))
    conjuntoLibros.agregarLibro(Libro("El lenguaje de programación C", "Brian W. Kernighan", 490, 9))
    conjuntoLibros.agregarLibro(Libro("De Ratones y Hombres", "John Steinbeck", 168, 8))

    println(conjuntoLibros)
    println("\n*************\n")

    println("Ordenados de mayor a menor:")
    conjuntoLibros.ordenarLibrosMayorAMenor()
    println(conjuntoLibros)
    println("\nOrdenados de menor a mayor:")
    conjuntoLibros.ordenarLibrosMenorAMayor()
    println(conjuntoLibros)
}