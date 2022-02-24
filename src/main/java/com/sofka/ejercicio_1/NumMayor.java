package com.sofka.ejercicio_1;


import javax.swing.*;

public class NumMayor {
    public static void main(String[] args) {
        int nro1 = 10;
        int nro2 = 12;
        if (nro1==nro2){
            JOptionPane.showMessageDialog(null," Los números son iguales");
        }else{
            int max = ( nro1 > nro2 ) ? nro1 : nro2 ;
            JOptionPane.showMessageDialog(null,"El número mayor es: " + max); }


    }
}
