package com.sofka.ejercicio6;

import java.util.ArrayList;

public class forparEimpar {


    public static void funcion(){

        ArrayList<Integer> pares=new ArrayList<>();
        ArrayList<Integer> impares=new ArrayList<>();

        for (int x=1;x<=100;x++){
            int num=x%2;
            if(num==0){
                pares.add(x);

            }else{
                impares.add(x);

            }

        }
        System.out.println("Estos son numeros pares: " + pares);
        System.out.println("Estos son numeros impares: "+ impares);

    }

    public static void main(String[] args) {
        funcion();

    }
}
