package com.sofka.ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class PareImpar {


    public static void funcion(){
        int x=1;
        ArrayList<Integer> pares=new ArrayList<>();
        ArrayList<Integer> impares=new ArrayList<>();

        while (x>0 && x<=100){
            int num=x%2;
              if(num==0){
                pares.add(x);

              }else{
                impares.add(x);

            }
              x++;
        }
        System.out.println("Estos son numeros pares: " + pares);
        System.out.println("Estos son numeros impares: "+ impares);

    }

    public static void main(String[] args) {
        funcion();

    }

    }

