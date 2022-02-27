package com.sofka.ejercicio11;

import com.sofka.vista.vista;

import java.util.Locale;

public class Contar_Frase {

    public static void main(String[] args) {
        vista in = new vista();

        String frase=in.texto("Por favor ingrese una frase");
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        char car;

        String[] palabras=frase.split("\\s+");
        int tam_espacios=frase.length();
        int tam_sinespacios=frase.replace(" ","").length();


        for (int x = 0; x<frase.toLowerCase().length(); x++){
                car=frase.charAt(x);
                if(car == 'a') a++;
                else if(car=='e') e++;
                else if(car== 'i')i++;
                else if (car=='o')o++;
                else if (car=='u')u++;
            }

        in.informacion("La frase tiene "+palabras.length +" palabras");
        in.informacion("Tambien tiene "+tam_espacios+" caracteres con espacios incluidos");
        in.informacion("Y tiene "+tam_sinespacios+" caracteres sin espacion incluidos");
        in.informacion("Adicional se encontraron "+a+" ='a' "+e+" ='e' "+i+" ='i' "+o+
                               " ='o' "+u+" ='u' en el texto");
            
        }



    }

