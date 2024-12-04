package rosa.example;
import java.util.ArrayList;
import java.util.Scanner;

import rosa.example.Autor;
import rosa.example.Libro;
/**
 * Hello world!
 */
public final class App {
    //1Biblioteca tiene Muchos Autores
    public static ArrayList<Autor> LAutores = new ArrayList<>();
    public static ArrayList<Libro> LLibros = new ArrayList<>();
    public static Scanner entrada = new Scanner(System.in); 

    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App.insertarAutores();
       // App.mostrarAutores();
        System.out.println("-----------------------------");
        App.insertarLibros();
        App.mostrarLibros();
        App.librosAutor(2);
        App.librosCategoria(cat);
        App.librosCategoria1(cat);
   
    //4.El libro más caro de un autor
    //5.El libro más barato de Paraninfo
    //6.
    }
     //3.Los libros de Programación de Paraninfo mayores de 50€
    public static


     //2.Los libros de Anaya
     public static ArrayList<Libro> librosEditorial(String ed){
        ArrayList<Libro> listaLibros= new ArrayList<>();
        for(Libro libro: App.LLibros){
            if(Libro.getAutor().editorial.equals(ed)){
                listaLibros.add(libro);
            }
        }
        return listaLibros;
     }

     //1.Info los Autores que tienen libros de Redes
    //-----librosCategoria("Redes")-------
    public static void librosCategoria(String cat){
        //con la RI de Autor
        //recorriendo los autores?
        for (Autor autor: App.LAutores){
            for(Libro libro: autor.getLibros()){
                if (libro.categoria.equals(cat)){
                    autor.info();

                }
            }
        }
    }
    public static void librosCategoria1(String cat){
        //sin la RI en Autor
        for(Libro libro: App.LLibros){
            if (libro.categoria.equals(cat)){
                libro.getAutor().info();
                //Autor autor = libro.getAutor();
                //autor.info();
            }

        }

    }
    public static void insertarAutores(){
        int i=1;
        while (i<=2){
            Autor autor = new Autor(i);
            App.LAutores.add(autor);
            i++;
        }
    }
    public static void insertarLibros(){
        int i=10;
        while (i<=11){
            Libro libro = new Libro(i); //PedirDatos()
            System.out.print("Autor del Libro: ");
            int nif = App.entrada.nextInt();
            //Buscar ese nif en la Lista de Autores y devolver el Autor
            Autor autor = App.buscarAutor(nif);
            libro.setAutor(autor);
            autor.setLibros(libro);

            App.LLibros.add(libro);
            i++;
        }
    }

    public static void mostrarAutores(){
        for (Autor autor: App.LAutores){
            autor.info();
        }
    }
    public static void mostrarLibros(){
        for (Libro libro: App.LLibros){
            libro.info();
        }
    }

    public static Autor buscarAutor(int codigo){
        Autor autorEncontrado = null;
        for (Autor autor: App.LAutores){
            if (autor.getAutorId() == codigo){
                autorEncontrado = autor;
                // return autor;
            }
        }
        return autorEncontrado;
    }
}