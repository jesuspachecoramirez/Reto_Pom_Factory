package com.sofka.ejercicio10;

import com.sofka.vista.vista;

public class sinEspacios {

    public static void main(String[] args) {
        vista in = new vista();
        String frase= in.texto("Por favor ingrese una frase");
        String respuesta=frase.replaceAll("\\s","");
        in.informacion("Ahora la frase es: "+respuesta);

    }




}
