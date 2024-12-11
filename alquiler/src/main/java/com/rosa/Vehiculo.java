package com.rosa;


import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {
    public String matricula;
    public String marca;
    public String modelo;
    //Almacenar el precio diario por km en una semana de un coche
    //Ej (lunes 2€, martes 2.3, miercoles 1.3,3.4,3.5,5.6,2.4)
    //Almacenar los kms (aletorio) recorridos cada dia durante un mes
    public  Scanner entrada = new Scanner(System.in); 
    private ArrayList<Double> preciosDia = new ArrayList<>();
    private ArrayList<Double> kmsDia = new ArrayList<>();
//Almacena km y precio acumulados del lunes,martes...
    private ArrayList<Double>KmDiaSemana = new ArrayList<>();
    private ArrayList<Double>precioDiaSemana = new ArrayList<>();
    public Vehiculo(){
        this.PedirDatos();
        this.fijarPreciosSemana();
        this.mostrarDatos();
        this.generarViajes();
        

    }
    

    public void PedirDatos(){
        System.out.print("Matricula: ");
        String matricula = this.entrada.next();
        this.setMatricula(matricula);
    
        System.out.print("Marca: ");
        String marca = this.entrada.next();
        this.setMarca(marca);
    
        System.out.print("Modelo: ");
        String modelo = this.entrada.next();
        this.setModelo(modelo);
    }
    public void generarViajes(){
        for (int i = 0; i < 31; i++) {
            double kilometraje =Math.random()*200+50;
            kilometraje=Math.round(kilometraje*100)/100;
            this.kmsDia.add(kilometraje);
        }
    }
    public void fijarPreciosSemana(){
        for (int i = 0; i<7; i++) {
            double precio =Math.random()*5;
            precio=Math.round(precio*100)/100;
            this.preciosDia.add(precio);
        }
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void mostrarViajes(){
        int i=0;
        String tabla="";
        for(Double dia: this.kmsDia){
            if (i<7){
                tabla = tabla + dia + "  ";
            }else{
            i=0;
            tabla = tabla + "\n"+ dia;
            }
            i++;
        }
        //System.out.println("Viajes: ");
        System.out.println(tabla);
    }
    public void mostrarPreciosSemana(){
        String[] dias = {"L: ","M: ","X: ","J: ","V: ","S: ","D: "};
        String precios = "";
        int i = 0;
        for (double precio: this.preciosDia){
            precios = precios + dias[i] + precio+ " ";
            i++;
        }
        System.out.println(" Precios "+ precios);
    }
    public void mostrarDatos(){
        System.out.print("Vehiculo: "+this.matricula+" "+this.marca+ "/"+this.modelo);
        this.mostrarPreciosSemana();       
        this.mostrarViajes();

}
    public Double totalDia(int dia){
        //0 L, 1 M...6 D
        double total=0;
        int i=0;
        for (double km: this.kmsDia){
            if(i % 7 == dia){
                total += km;
            }
            i++;
        }
        //System.out.println("El día " + dia + " se hacen "+ total + "kms");
        return total;
    }
    public void informe(){
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println("Vehiculo: " + this.matricula + " " + this.marca + "/" + this.modelo);
        System.out.print("-----------------------------------");
        System.out.printf("%10s", "");
        for (int i=0; i<7; i++){
            System.out.printf("%10s", dias[i]);   
        }
        System.out.println();
        System.out.printf("%10s", "KmTotales");
        for (int i=0; i<7; i++){
            this.KmDiaSemana.add(this.totalDia(i));
            System.out.printf("%10.2f", this.KmDiaSemana.get(i));    
        }

        System.out.println();
        System.out.printf("%10s", "PrecioTotal");
        Double total;
        for (int i=0; i<7; i++){
            total = this.KmDiaSemana.get(i) * this.preciosDia.get(i);
            this.precioDiaSemana.add(total);
            System.out.printf("%10.2f", this.precioDiaSemana.get(i));    
        }
        System.out.println();
    }
}

