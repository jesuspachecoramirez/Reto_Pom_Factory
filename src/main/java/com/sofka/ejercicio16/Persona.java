package com.sofka.ejercicio16;

import java.util.Random;
import java.util.stream.IntStream;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni = "";
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = (this.peso) / (double) Math.pow(this.altura, 2);
        int estado = 0;

        if (imc < 20) {
            estado = -1;
        } else if (imc > 25) {
            estado = 1;
        }
        if (this.peso == 0 && this.altura == 0) estado = 2;
        EstadoIMC(estado);

        return estado;
    }

    public void EstadoIMC(int estado) {
        switch (estado) {
            case -1:
                System.out.printf("%s se encuentra baj%s de peso.%n", this.nombre, this.sexo == 'M' ? "a" : "o");
                break;
            case 0:
                System.out.printf("%s se encuentra en un peso normal.%n", this.nombre);
                break;
            case 1:
                System.out.printf("%s se encuentra en sobrepeso.%n", this.nombre);
                break;
            default:
                System.out.printf("El IMC de %s no se puede determinar.%n", this.nombre);
                break;
        }
    }



    public int MayoroMenor(int edad){
        if (this.edad<18){
            System.out.println("Y es menor de edad");
        }else{
            System.out.println("Y es mayor de edad");
        }
        return edad;
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'M') {
            this.sexo = 'M';
        }
    }

    public String generaDNI() {
        Random aleatorio = new Random();
        StringBuilder dniAleatorio = new StringBuilder();

        IntStream.range(0, 8).forEach(x ->
                dniAleatorio.append(aleatorio.nextInt(10))
        );

        return dniAleatorio.toString();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
