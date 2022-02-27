package com.sofka.ejercicio14;

import com.sofka.vista.vista;

import java.util.ArrayList;

public class CuentaaPar {
    private static vista in;

    public static long dato(){
        long num= in.numeros("Por favor ingrese un número entero menor a 1000");

        return num;
    }


    public static void funcion(){
         long num=dato();
        ArrayList<Long> result= new ArrayList<>();
       while(num>=1000 || num<0){
            if(num>=1000){
                in.informacion("Ha ingresado un número mayor a 1000");
                num=dato();
            }else if(num<0){
                in.informacion("No ha ingresado un número entero");
                num=dato();
            }

        }
       for(long cont=num;cont<=1000;cont=cont+2){
          result.add(cont);
       }
        in.informacion("Los numeros desde "+num+ " hasta 1000 de 2 en 2 es : "+result);

    }

    public static void main(String[] args) {
         in =new vista();
         funcion();
    }
}
