package com.sofka.ejercicio13;

import java.time.LocalDateTime;

public class Horario {

    public static void main(String[] args) {
        LocalDateTime tiempo = LocalDateTime.now();
        int anho = tiempo.getYear();
        int mes = tiempo.getMonthValue();
        int dia = tiempo.getDayOfMonth();
        int hora = tiempo.getHour();
        int min = tiempo.getMinute();
        int seg = tiempo.getSecond();

        System.out.printf("La fecha de hoy es:(%s/%s/%s) y la hora exacta: (%s:%s:%s)", anho, mes, dia, hora, min, seg);
    }
}
