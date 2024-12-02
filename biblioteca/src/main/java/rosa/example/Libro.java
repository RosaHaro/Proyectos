package rosa.example;
import java.util.Scanner;

public class Libro {
    private int codigo;
    private String titulo;
    private int anio;
    private Autor autor;
    private boolean prestado;
    public Scanner entrada = new Scanner (System.in);
    public Libro (int codigo, String titulo, int anio){

    }
    public void PedirDatos(){
        System.out.println("Libro con Codigo:"+this.codigo);
        System.out.println("----------------------");
        System.out.print("Titulo: ");
        String titulo = this.entrada.next();
        this.setTitulo(titulo);
        System.out.print("Año: ");
        int anio = this.entrada.nextInt();
        this.setAnio(anio);
        this.setPrestado(false);
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setPrestado(boolean prestado){
        this.prestado=prestado;
    }
    public void setAutor(Autor autor){
        this.autor =autor;
    }
    public void info(){
        System.out.println(
            "Libro "+ this.codigo + " : "
            +this.anio+"/"

                +this.autor.getNombreCompleto()+")");
    }
        

}