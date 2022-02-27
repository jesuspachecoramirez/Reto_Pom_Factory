package com.sofka.ejercicio15;

import com.sofka.vista.vista;

public class Menu {

    public static void main(String[] args) {
        int opcion = 0;
        vista in = new vista();

        while (opcion != 8) {
            String menu = " GESTION CINEMATOGRAFICA" + "\n"
                    + "Seleccione tarea a realizar:" + "\n"
                    + "1. NUEVO ACTOR" + "\n"
                    + "2. BUSCAR ACTOR" + "\n"
                    + "3. ELIMINAR ACTOR" + "\n"
                    + "4. MODIFICAR ACTOR" + "\n"
                    + "5. VER TODOS LOS ACTORES" + "\n"
                    + "6. VER PELICULAS DE LOS ACTORES" + "\n"
                    + "7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" + "\n"
                    + "8. SALIR" + "\n"
                    + "Opcion: ";
            opcion = in.respuesta(menu);
            switch (opcion) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {

                    break;
                }
                case 7:{
                    break;
                }
                case 8:{
                    in.informacion("\n" + "Hasta pronto");
                    break;
                }
                default:
                    in.informacion("Opcion no valida");

            }

        }
    }
}
