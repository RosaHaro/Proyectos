# Proyectos
Carpeta con ejercicios Java POO

MATH RANDOM
temp =Math.random()*10;
=Math.round(temp*100)/100;


POO la clase objeto
package;
import java.util.ArrayList;
import java.util.Scanner;

import nombrecarpeta.nombrearchivo;

public final class NOMBRECLASE{
    
    public static ArrayList<NOMBRECLASEOBJETOS> L+NOMBREOBJETO PARA LA LISTA = new ArrayList<>();
    public static Scanner entrada = new Scanner(System.in); //Para introducir datos

    private NOMBRECLASE() { //Constructor vacio
    }
    private NOMBRECLASE(int Nº, String "cadena de caracteres")
    this.nª;
    this.String;
   //Setter con array 
   public void setDias(){
        this.dias.add("Lunes"); this.dias.add("Martes"); this.dias.add("Miercoles"); this.dias.add("Jueves"); 
        this.dias.add("Viernes"); this.dias.add("Sabado"); this.dias.add("Domingo"); 
    }
    public static void main(String[] args) {
        App.insertarAutores(); //llamar metodos que están en la clase del objeto
       
        }
    //
      public void mostrarTemperaturas() {
        
        ArrayList<Integer> tempDia = new ArrayList<>();

        for (int i=0; i<this.temperaturas.size(); i++){
            System.out.println("Dirección array tempDia (hashCaode):"+Integer.toHexString(System.identityHashCode(tempDia)));
            //System.out.print(this.temperaturas.get(i));
            tempDia = this.temperaturas.get(i);
            for (int temp: tempDia ){
                System.out.print(temp + "["+ Integer.toHexString(System.identityHashCode(temp))+"],");
            }
            System.out.println();
            }
   POO EN CLASE PRINCIPAL
   package ;
import java.util.Scanner;
public class aemet2 {

   public static final int NCIUDADES = 3;
    private static String[] ciudades = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"}; //ARRAY
  
    public static Scanner entrada = new Scanner(System.in); 
    public static RegCiudad[] registroTemp = new RegCiudad[NCIUDADES] ;
