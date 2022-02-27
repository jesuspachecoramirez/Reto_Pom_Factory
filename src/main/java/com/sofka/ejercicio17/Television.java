package com.sofka.ejercicio17;

public class Television extends Electrodomestico {

    protected int resolucion = 20;
    protected boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        if (resolucion > 40) this.precioBase = precioBase * 1.3;
        if (sintonizadorTDT) this.precioBase = precioBase + 50;
        super.precioFinal();
    }

    @Override
    public String toString() {
        return "Television{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                '}';
    }
}
