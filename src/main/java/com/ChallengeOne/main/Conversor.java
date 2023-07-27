/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ChallengeOne.main;

/**
 *
 * @author Ema
 */
public class Conversor {
    public static String conversion(String monedaInicialStr, Divisas monedaFinal) {
        try {
            double monedaInicial = Double.parseDouble(monedaInicialStr);
            double valorFinal;
            
            if (monedaInicial < 0) {
                throw new IllegalArgumentException();
            }
            
            valorFinal = monedaInicial * monedaFinal.getTasaConversion();
            return String.valueOf(valorFinal);
            
        } catch (Exception e) {
            return "0.00";
        }
    }
}
