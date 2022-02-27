package com.sofka.vista;

import java.util.Scanner;

public class vista {
    Scanner entrada = new Scanner(System.in);


    public String texto(String mensaje) {
        String texto = "";
        System.out.println(mensaje);
        texto = entrada.nextLine();
        return texto;
    }

    public long numeros(String mensaje) {
        long numero = 0;
        try {
            System.out.println(mensaje);
            numero = entrada.nextLong();
            entrada.nextLine();
        } catch (Exception x) {
            entrada.nextLine();
            System.out.println("No ha ingresado un numero");
            numero = 0;
        }
        return numero;
    }
    public int respuesta(String mensaje) {
        int dato = 0;
        try {
            System.out.println(mensaje);
            dato = entrada.nextInt();
            entrada.nextLine();
        }catch (Exception x) {
            entrada.nextLine();
            System.out.println("No ha ingresado un numero");
            dato = 0;
        }

        return dato;

    }

    public double decimales(String mensaje){
        double deci=0.0;
        try{
            System.out.println(mensaje);
            deci=entrada.nextDouble();
            entrada.nextLine();
        }catch (Exception x){
            entrada.nextLine();
            System.out.println("No ha ingreado un numero valido");
            deci=0.0;
        }
        return deci;
    }

    public void informacion(String mensaje) {
        System.out.println(mensaje);
    }


    public char next(String mensaje) {
        char next = ' ';
        System.out.println(mensaje);
        next = entrada.next().charAt(0);
        return next;

    }
}

