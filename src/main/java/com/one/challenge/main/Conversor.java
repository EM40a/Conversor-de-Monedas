/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.one.challenge.main;

/**
 *
 * @author Ema
 */
public class Conversor {
    public static String convertirA(String montoInicial, Divisas monedaOrigen,Divisas monedaFinal) {
        try {
            double montoInicialDouble = Double.parseDouble(montoInicial); // La monedaFinal a la que se va a convertir
            double montoFinal; // El valor convertido
            
            if (montoInicialDouble <= 0 || monedaOrigen.equals(monedaFinal)) {
                throw new IllegalArgumentException();
            }
            
            if (monedaOrigen.getSigla() == "ARS") {
                montoFinal = montoInicialDouble * monedaFinal.getTasaConversion();
            } else {
                montoFinal = montoInicialDouble / monedaOrigen.getTasaConversion();

            }
            return String.valueOf(montoFinal);
            
        } catch (IllegalArgumentException e) {
            return "0.00";
        }
    }
}
