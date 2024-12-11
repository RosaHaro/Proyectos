package com.rosa;

import java.util.ArrayList;

public class Alquiler {
    private static ArrayList<Vehiculo>Lvehiculos = new ArrayList<>();
    private Alquiler(){
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Vehiculo vehiculo= new Vehiculo();
            Alquiler.Lvehiculos.add(vehiculo);
        }
        System.out.println("--------Informes---------");
        for (Vehiculo vehiculo: Alquiler.Lvehiculos) {
            vehiculo.informe();
    }
    Alquiler.maxKm();
}
    public static void maxKm(){
        int i=0;//coche
        double maxKm=0;
        int pmax =0;
        for (Vehiculo vehiculo: Alquiler.Lvehiculos){
            if(vehiculo.KmDiaSemana.get(0) >maxKm){
                maxKm = vehiculo.KmDiaSemana.get(0);
                pmax=i;
            }
        }
        System.out.println("El lunes"+Alquiler.Lvehiculos.get(pmax).matricula+ "ha hecho "+maxKm);

    }
}

