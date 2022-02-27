package com.sofka.ejercicio9;

import com.sofka.vista.vista;

public class rem_texto {
    private static vista in;
    public static void main(String[] args) {
        in= new vista();

        String oracion1="La sonrisa sera la mejor arma contra la tristeza ";
        in.informacion(oracion1);
        String texto= oracion1.replace("a","e");
        String oracion2= in.texto("Ingrese una oracion para terminar esta frase");

        in.informacion(texto+oracion2);

    }


}
