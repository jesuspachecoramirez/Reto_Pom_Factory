package com.sofka.ejecicio4;

import javax.swing.*;

public class PrecioIva {
    public static void funcion(){
        final double iva=0.21;
        double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        double resultado=(precio*iva)+precio;
        JOptionPane.showMessageDialog(null,"El precio del producto con IVA es "+resultado);

    }

    public static void main(String[] args) {
        funcion();
    }
}
