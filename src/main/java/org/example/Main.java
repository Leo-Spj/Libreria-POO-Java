package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creando novelas
        Novela novela1 = new Novela("El señor de los anillos", "J.R.R. Tolkien", 1954, "Fantasía");
        Novela novela2 = new Novela("El código Da Vinci", "Dan Brown", 2003, "Misterio");
        Novela novela3 = new Novela("El alquimista", "Paulo Coelho", 1988, "Aventura");
        Novela novela4 = new Novela("El principito", "Antoine de Saint-Exupéry", 1943, "Infantil");
        Novela novela5 = new Novela("El nombre del viento", "Patrick Rothfuss", 2007, "Fantasía");
        Novela novela6 = new Novela("El retrato de Dorian Gray", "Oscar Wilde", 1890, "Terror");
        // Creando libros de texto
        LibroDeTexto libroDeTexto1 = new LibroDeTexto("Matemáticas", "Rafael Espinoza", 2010, "Matemáticas");
        LibroDeTexto libroDeTexto2 = new LibroDeTexto("Física", "Alberto A", 2010, "Física");
        LibroDeTexto libroDeTexto3 = new LibroDeTexto("Química", "Beto B", 2010, "Química");
        LibroDeTexto libroDeTexto4 = new LibroDeTexto("Biología", "Carlos C", 2010, "Biología");
        LibroDeTexto libroDeTexto5 = new LibroDeTexto("Historia", "Daniel D", 2010, "Historia");
        LibroDeTexto libroDeTexto6 = new LibroDeTexto("Geografía", "Eduardo E", 2010, "Geografía");

        // Creando estanterías
        Estanteria<Novela> estanteriaNovelas = new Estanteria<>(); // creo un arreglo de novelas mediante el uso de generics
        Estanteria<LibroDeTexto> estanteriaLibrosTexto = new Estanteria<>();

        // Agregando novelas a la estantería
        estanteriaNovelas.agregarLibro(novela1);
        estanteriaNovelas.agregarLibro(novela2);
        estanteriaNovelas.agregarLibro(novela3);
        estanteriaNovelas.agregarLibro(novela4);
        estanteriaNovelas.agregarLibro(novela5);
        estanteriaNovelas.agregarLibro(novela6);

        // Agregando libros de texto a la estantería
        estanteriaLibrosTexto.agregarLibro(libroDeTexto1);
        estanteriaLibrosTexto.agregarLibro(libroDeTexto2);
        estanteriaLibrosTexto.agregarLibro(libroDeTexto3);
        estanteriaLibrosTexto.agregarLibro(libroDeTexto4);
        estanteriaLibrosTexto.agregarLibro(libroDeTexto5);
        estanteriaLibrosTexto.agregarLibro(libroDeTexto6);

        // Listando novelas
        System.out.println("Novelas:");
        estanteriaNovelas.listarLibros();

        // Listando libros de texto
        System.out.println("Libros de texto:");
        estanteriaLibrosTexto.listarLibros();

        // simulando venta de libros
        libroDeTexto1.establecerPrecio(100);
        libroDeTexto2.establecerPrecio(200);
        libroDeTexto3.establecerPrecio(300);
        libroDeTexto4.establecerPrecio(400);
        libroDeTexto5.establecerPrecio(500);
        libroDeTexto6.establecerPrecio(600);

        // simulando venta de novelas
        novela1.establecerPrecio(1000);
        novela2.establecerPrecio(2000);
        novela3.establecerPrecio(3000);
        novela4.establecerPrecio(4000);
        novela5.establecerPrecio(5000);
        novela6.establecerPrecio(6000);

        System.out.println(novela1.estaPrestado());
        novela1.prestar();
        System.out.println(novela1.estaPrestado());
        novela1.prestar();
        novela1.devolver();
        System.out.println(novela1.estaPrestado());


    }
}