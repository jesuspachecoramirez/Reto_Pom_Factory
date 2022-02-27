package com.sofka.ejercicio7;


import java.util.Scanner;

public class NumCero {
    public static void funcion(){
        Scanner entrada = new Scanner(System.in);
        int nro=1;

        do {

            if(nro>0) {
                System.out.println("Por favor ingrese un número entero: ");
                nro= entrada.nextInt();

            } else {
                System.out.println("El número ingresado no es entero, Por favor intentelo nuevamente");
                System.out.println("Ingrese un número entero: ");
                nro=entrada.nextInt();
            }
        } while (nro<=0);

        System.out.printf("Correcto!, Ingresaste el número: " +nro+ " el cual es entero");
    }



    public static void main(String[] args) {
       funcion();
    }
}
