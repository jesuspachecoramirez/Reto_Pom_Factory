package com.sofka.ejercicio17;

import java.util.regex.Pattern;

public class Electrodomestico {

    protected double precioBase = 100;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        boolean verificador = Pattern.compile("[A-F]").matcher(String.valueOf(letra)).matches();
        if (verificador) this.consumoEnergetico = letra;
    }

    public void comprobarColor(String color) {

        switch (color.toLowerCase()) {
            case "negro":
            case "rojo":
            case "gris":
            case "azul":
                this.color = color;
                break;
            default:
                this.color = "blanco";
                break;
        }
    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precioBase = precioBase + 100;
                break;
            case 'B':
                this.precioBase = precioBase + 80;
                break;
            case 'C':
                this.precioBase = precioBase + 60;
                break;
            case 'D':
                this.precioBase = precioBase + 50;
                break;
            case 'E':
                this.precioBase = precioBase + 30;
                break;
            case 'F':
                this.precioBase = precioBase + 10;
                break;
            default:
                break;
        }

        if (peso >= 0 && peso < 20) {
            this.precioBase = precioBase + 10;
        } else if (peso >= 20 && peso < 50) {
            this.precioBase = precioBase + 50;
        } else if (peso >= 50 && peso < 80) {
            this.precioBase = precioBase + 80;
        } else if (peso >= 80) {
            this.precioBase = precioBase + 100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
