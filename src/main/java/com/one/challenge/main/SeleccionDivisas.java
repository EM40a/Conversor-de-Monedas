
package com.one.challenge.main;

/**
 *
 * @author Ema
 */
public class SeleccionDivisas {
    public static String[] Opciones() {
        String[] divisaNames = new String[Divisas.monedas.length];

        divisaNames[0] = "Seleccione una opcion:";

        for (int i = 1; i < Divisas.monedas.length; i++) {
            divisaNames[i] = Divisas.monedas[0].getNombre() + " a " + Divisas.monedas[i].getNombre();
        }
        
        return divisaNames;
    }
}
