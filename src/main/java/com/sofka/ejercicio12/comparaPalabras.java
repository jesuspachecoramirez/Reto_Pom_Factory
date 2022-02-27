package com.sofka.ejercicio12;

import com.sofka.vista.vista;

public class comparaPalabras {

    public static void main(String[] args) {
        vista in= new vista();
        boolean aviso=false;
        String p1=in.texto("Ingresa una primera palabra");
        String p2= in.texto("Ingresa una segunda palabra");

        if(p1.replace(" ","").length() != p2.replace(" ","").length()){
            in.informacion("Las palabras tienen diferente cantidad de caracteres");
        }else{
            for(int i=0;i<p1.length();i++ ){
                char diferencia1=p1.charAt(i);
                char diferencia2=p2.charAt(i);
                if(diferencia1!=diferencia2){
                    in.informacion("Las palabras no son iguales, en la ubicacion "+(i+1)+" la palabra "+
                            p1+" tiene el caracter "+diferencia1+" y la palabra "+p2+" tiene "+diferencia2);
                    aviso=true;
                }
            }
            if(!aviso)
            in.informacion("Las palabras escritas son iguales");
        }

    }
}
