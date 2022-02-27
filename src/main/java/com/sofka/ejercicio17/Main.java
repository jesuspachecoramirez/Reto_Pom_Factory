package com.sofka.ejercicio17;

import com.sofka.vista.vista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    vista in = new vista();

    final double[] precioElectrodomesticos = new double[1];
    final double[] precioLavadoras = new double[1];
    final double[] precioTelevisores = new double[1];

    Electrodomestico[] electrodomesticos = new Electrodomestico[10];
    electrodomesticos[0] = new Electrodomestico();
    electrodomesticos[1] = new Electrodomestico(330, 80);
    electrodomesticos[2] = new Electrodomestico(541, "verde", 'A', 50);
    electrodomesticos[3] = new Lavadora();
    electrodomesticos[4] = new Lavadora(280, 78);
    electrodomesticos[5] = new Lavadora(690, "Azul", 'C', 58, 70);
    electrodomesticos[6] = new Television();
    electrodomesticos[7] = new Television(980, 45);
    electrodomesticos[8] = new Television(370, "Rojo", 'D', 13, 24, true);
    electrodomesticos[9] = new Television(580, "NEGRO", 'E', 34, 52, true);

        Arrays.stream(electrodomesticos).forEach(electrodomestico -> {
        electrodomestico.precioFinal();
        if (electrodomestico instanceof Lavadora) {
            precioLavadoras[0] = precioLavadoras[0] + electrodomestico.getPrecioBase();
        } else if (electrodomestico instanceof Television) {
            precioTelevisores[0] = precioTelevisores[0] + electrodomestico.getPrecioBase();
        }
        precioElectrodomesticos[0] = precioElectrodomesticos[0] + electrodomestico.getPrecioBase();
    });

        in.informacion("El precio de todos los electrodomesticos es: " + precioElectrodomesticos[0]);
        in.informacion("El precio de todas las lavadoras es: " + precioLavadoras[0]);
        in.informacion("El precio de todos los televisores es: " + precioTelevisores[0]);
}
}

