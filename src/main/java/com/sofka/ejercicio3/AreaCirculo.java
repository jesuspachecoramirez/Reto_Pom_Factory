package com.sofka.ejercicio3;

import javax.swing.*;

public class AreaCirculo {
    public static void funcion(){
        final double pi=3.14;
        double radio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        double area=(pi*Math.pow(radio,2));
        JOptionPane.showMessageDialog(null, "El area del circulo es: "+area);

    }

    public static void main(String[] args) {
        funcion();

    }

    }





