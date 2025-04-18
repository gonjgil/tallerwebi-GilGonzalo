package com.tallerwebi.TDD;

public class ValidadorDeContrasenia {

    private String contrasenia;

    public ValidadorDeContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String evaluarFortaleza() {
        if (this.contrasenia.length() >=7) {
            int cantidadDeNumeros = 0;
            for (int i = 0; i < this.contrasenia.length(); i++) {
                if (Character.isDigit(this.contrasenia.charAt(i))) {
                    cantidadDeNumeros++;
                }
            }
                if (cantidadDeNumeros >= 4) {
                    return "MEDIANA";
                }
                return "DEBIL";
            }
        return "INVALIDA";
    }

}