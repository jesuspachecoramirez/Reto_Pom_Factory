package com.sofka.ejercicio17;

public class Lavadora extends Electrodomestico {

    protected double carga = 5;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void precioFinal() {
        if (carga > 30) this.precioBase = precioBase + 50;
        super.precioFinal();
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
}
