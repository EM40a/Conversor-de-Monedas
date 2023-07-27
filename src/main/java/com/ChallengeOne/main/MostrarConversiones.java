/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ChallengeOne.main;

/**
 *
 * @author Ema
 */
public class MostrarConversiones {
    public static String[] Opciones() {
        
        String[] divisaNames = new String[Divisas.monedas.length];

        divisaNames[0] = "Seleccione una opcion:";

        for (int i = 1; i < Divisas.monedas.length; i++) {
            divisaNames[i] = Divisas.monedas[0].getNombre() + " a " + Divisas.monedas[i].getNombre();
        }
        
        return divisaNames;
    }
}
