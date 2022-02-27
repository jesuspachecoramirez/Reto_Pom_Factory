package com.sofka.ejercicio18;

import com.sofka.vista.vista;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        vista in = new vista();
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("Descendants of the sun",1,"Romance","Lee Eung Bok");
        series[1] = new Serie("SuperNatural", " Eric Kripke");
        series[2] = new Serie("Smallville", 10, "Superheroes", "Jerry Siegel; Joe Shuster");
        series[3] = new Serie("Game of Thrones", 8, "Thriller", "David Benioff");
        series[4] = new Serie("Chernobil", " Johan Renck");
        videojuegos[0] = new Videojuego("Dark Souls",60,"Rol Accion","Bandai Namco Entertainment");
        videojuegos[1] = new Videojuego("Need for Speed", 15);
        videojuegos[2] = new Videojuego("Call of Duty", 20, "Shooter", " Infinity Ward, Treyarch");
        videojuegos[3] = new Videojuego("Final Fantasy X", 100, "Aventura", " Squaresoft");
        videojuegos[4] = new Videojuego("League of Legends", 30);

        series[3].entregar();
        series[1].entregar();
        series[4].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();

        AtomicInteger seriesEntregadas = new AtomicInteger();
        AtomicInteger juegos = new AtomicInteger();

        in.informacion("Series y videojuegos entregados: ");

        Arrays.stream(series).filter(Serie::isEntregado).forEach(serie -> {
            seriesEntregadas.getAndIncrement();
            in.informacion("\n"+serie);
        });
        in.informacion(" \nCantidad de series entregadas: " + seriesEntregadas);

        Arrays.stream(videojuegos).filter(Videojuego::isEntregado).forEach(videojuego -> {
            juegos.getAndIncrement();
            in.informacion("\n"+videojuego);
        });
        in.informacion("\nCantidad de videojuegos entregados: " + juegos+"\n");



        Serie e_series = (Arrays.stream(series).max(Serie::compareTo).get());
        Videojuego e_juegos = (Arrays.stream(videojuegos).max(Videojuego::compareTo).get());

        in.informacion("\n La Serie con mas temporadas es:\n "+e_series+
                "\n y El Videojuego con mas horas es:\n " +e_juegos );
    }

}
