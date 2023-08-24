package com.mycompany.pootaller1ej1;
//Este codigo devuelve La edad de la mamá de Juan en base a la edad de sus tres hijos.
import java.util.Scanner;
public class POOtaller1ej1 {

    public static void main(String[] args) {
        float Juan, Alberto, Ana;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de juan: ");
        Juan = entrada.nextFloat();
        Alberto = Juan*2/3;
        Ana = Juan*4/3;
        System.out.println("La edad de Juan es de: " + Math.round(Math.floor(Juan)) + " años");
        System.out.println("La edad de Alberto es de: " + Math.round(Math.floor(Alberto)) + " años");
        System.out.println("La edad de Ana es de: " + Math.round(Math.floor(Ana)) + " años");
        System.out.println("La edad de la mamá de Juan es de: " + Math.round(Math.floor((Juan+Alberto+Ana))) + " años");
    }
}
