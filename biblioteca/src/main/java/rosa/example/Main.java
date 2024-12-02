package rosa.example;
import java.util.ArrayList;
import java.util.Scanner;

import rosa.example.Autor;
import rosa.example.Libro;
/**
 * Hello world!
 */
public final class Main {
    //1Biblioteca tiene Muchos Autores
    public static ArrayList<Autor> LAutores = new ArrayList<>();
    public static ArrayList<Libro>LLibros = new ArrayList<>();
    public static Scanner entrada = new Scanner (System.in);
    
    private Main() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Main.insertarAutores();
        Main.mostrarAutores();
        Main.insertarLibros();
        }
        public static void insertarAutores(){
        int i=1;
        while (i<=2){
            //el i (pk) se genera automaticax
            Autor autor = new Autor(i);
            // autor.PedirDatos();
            Main.LAutores.add(autor);
            i++;
        }
        }
        public static void insertarLibros(){
            int i=10;
            while (i<=13){
                Libro libro = new Libro(i); //pedirDatos()
                System.out.println("Autor del Libro: ");
                int nif = Main.entrada.nextInt();
                Autor autor = Main.buscarAutor(nif);
                libro.setAutor(autor);
                autor.setLibros(libro);
                Main.LLibros.add(libro);
                i++;
            }

        for (Autor autor: Main.LAutores){
            autor.info();
        }
    }
    public static void mostrarAutores(){
        for(Autor autor: Main.LAutores){
            autor.info();
        }
    public static void mostrarLibros(){
            for(Libro libro: Main.LLibros){
                libro.info();
            }
    }
    public static Autor buscarAutor(int codigo){
        for(Autor autor: Main.LAutores){
            if(autor.getAutorId()==codigo){
                autorEncontrado =autor;
            }
        }
        return autorEncontrado;
    }
}
}