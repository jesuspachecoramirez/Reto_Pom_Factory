package com.sofka.ejercicio2;

import javax.swing.*;


public class NumMayorv2 {

    public static void main(String[] args) {
        int nro1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        int nro2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        if (nro1==nro2){
            JOptionPane.showMessageDialog(null," Los números son iguales");
        }else{
            int max = ( nro1 > nro2 ) ? nro1 : nro2 ;
            JOptionPane.showMessageDialog(null,"El número mayor es: " + max); }


    }
}
