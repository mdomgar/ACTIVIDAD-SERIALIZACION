package Serialización.EjercicioLibros;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private transient double descuento;

    public Libro(String titulo, String autor, String isbn, Double precio, Double descuento) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + '\'' +
                ", autor: " + autor + '\'' +
                ", isbn: " + isbn + '\'' +
                ", precio: " + precio +
                ", descuento: " + descuento;
    }
}
