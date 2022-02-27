package com.sofka.ejercicio16;

import com.sofka.vista.vista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       vista in = new vista();
       //Scanner entrada= new Scanner(System.in);


        String nombre = in.texto("Digite su nombre: ");
        int edad = in.respuesta("Digite su edad: ");
        char sexo = in.next("Digite su sexo (H para Hombre, M para Mujer): ");
        double peso = in.decimales("Digite su peso en kilogramos (Kg): ");
        double altura = in.decimales("Digite su altura en metros(m): ");

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Gian");
        persona3.setEdad(16);
        persona3.setSexo('H');
        persona3.setPeso(45);
        persona3.setAltura(1.69);

        int imc1 = persona1.calcularIMC();
        int m1= persona1.MayoroMenor(edad);
        int imc2 = persona2.calcularIMC();
        int m2 = persona2.MayoroMenor(edad);
        int imc3 = persona3.calcularIMC();
        int m3 = persona3.MayoroMenor(edad);



        in.informacion(String.valueOf(persona1));
        in.informacion(String.valueOf(persona2));
        in.informacion(String.valueOf(persona3));
    }
    }

