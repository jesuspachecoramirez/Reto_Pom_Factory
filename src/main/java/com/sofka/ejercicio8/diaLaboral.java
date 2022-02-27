package com.sofka.ejercicio8;
import com.sofka.vista.vista;

import java.util.Locale;

public class diaLaboral {
    private static vista in;
    public static void funcion(){

        String dia=in.texto("Ingrese el día de la semana a consultar");
        dia=dia.toLowerCase(Locale.ROOT);
        switch (dia){
            case "lunes":
                in.informacion("Este es un día laboral");
                break;
            case "martes":
                in.informacion("Este es un día laboral");
                break;
            case "miercoles":
                in.informacion("Este es un día laboral");
                break;
            case "jueves":
                in.informacion("Este es un día laboral");
                break;
            case "viernes":
                in.informacion("Este es un día laboral");
                break;
            case "sabado":
                in.informacion("Este no es un día laboral, Feliz descanso");
                break;
            case "domingo":
                in.informacion("Este no es un día laboral, Feliz descanso");
                break;

        }


    }

    public static void main(String[] args) {
        in = new vista();
        funcion();
    }


}
