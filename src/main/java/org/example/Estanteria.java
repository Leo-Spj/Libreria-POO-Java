package org.example;


import java.util.ArrayList;

public class Estanteria <T extends Libro>{

    private ArrayList<T> listaLibros = new ArrayList<>();

    public void agregarLibro(T libro){
        listaLibros.add(libro);
    }

    public void removerLibro(T libro){
        listaLibros.remove(libro);
    }

    public void listarLibros(){
        for(T libro : listaLibros){
            System.out.println(libro.getTitulo());
        }
    }
}
