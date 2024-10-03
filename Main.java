package Serialización.EjercicioLibros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0", 29.99, 5.00);
        Libro libro2 = new Libro("1984", "George Orwell", "978-0-452-28423-4", 19.99, 3.00);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-3-16-148410-1", 14.99, 2.00);

        Biblioteca biblioteca = new Biblioteca();

        List<Libro> libros = new ArrayList<>(Arrays.asList(libro1,libro2,libro3));

        biblioteca.setListaLibros(libros);

        biblioteca.serializarLibros();

        biblioteca.deserializarLibro();
    }
}
