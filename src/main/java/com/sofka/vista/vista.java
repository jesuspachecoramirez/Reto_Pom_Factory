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

    public void informacion(String mensaje) {
        System.out.println(mensaje);
    }



    }

