package Serialización.EjercicioLibros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public List<Libro> mostrarLibros(){
        return getListaLibros();
    }

    public void serializarLibros(){
        try (FileOutputStream fileOutput = new FileOutputStream("biblioteca.dat");
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {

            for (Libro libro:getListaLibros()){
                objectOutput.writeObject(libro);
            }

            System.out.println("Los libros han sido serializados..");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void deserializarLibro(){
        try (FileInputStream fileInput = new FileInputStream("biblioteca.dat");
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {

            while (true) {
                try {
                    System.out.println(objectInput.readObject().toString());
                } catch (EOFException e){
                    System.out.println("Alcanzo el final del archivo");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
