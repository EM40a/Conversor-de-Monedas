/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ChallengeOne.main;

/**
 *
 * @author Ema
 */
public class Divisas {
    private final String nombre;
    private final String sigla;
    private final double tasaConversion;

    public static Divisas[] monedas = {
        new Divisas("Pesos Argentinos", "ARS", 1.0),
        new Divisas("Dolares", "USD", 0.0037),
        new Divisas("Euros", "EUR", 0.0033),
        new Divisas("Won Surcoreano", "KRW", 4.7),
        new Divisas("Libras Esterlinas", "GBP", 0.0029),
        new Divisas("Yen Japones", "JPY", 0.52)
    };

    public Divisas(String nombre, String sigla, double tasaConversion) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.tasaConversion = tasaConversion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getSigla() {
        return this.sigla;
    }

    public double getTasaConversion() {
        return this.tasaConversion;
    }
}
