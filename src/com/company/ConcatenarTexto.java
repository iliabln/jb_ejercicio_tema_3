package com.company;

public class ConcatenarTexto {

    public static void main(String[] args) {

        String textoConcatenado = "";

        String textos[] = {"Hola!", "Me llamo Ilia.", "Vivo en Torrevieja.", "Estoy estudiando Java en OpenBootcamp!"};

        for (int i = 0; i < textos.length; i++) {
            textoConcatenado = textoConcatenado + textos[i] + " ";

        }
        System.out.println(textoConcatenado);

    }
}
