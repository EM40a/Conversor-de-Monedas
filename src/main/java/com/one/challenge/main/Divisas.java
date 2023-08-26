
package com.one.challenge.main;

/**
 *
 * @author EM40a
 */
public class Divisas {
    private final String nombre;
    private final String sigla;
    private final double tipoCambio;

    public static Divisas[] monedas = {
        new Divisas("Peso Argentino", "ARS", 1.0),
        new Divisas("Dólar estadounidense", "USD", 0.0029),
        new Divisas("Euro", "EUR", 0.0027),
        new Divisas("Won Surcoreano", "KRW", 3.79),
        new Divisas("Libra Esterlina", "GBP", 0.0023),
        new Divisas("Yen Japonés", "JPY", 0.42)
    };

    public Divisas(String nombre, String sigla, double tipoCambio) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.tipoCambio = tipoCambio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getSigla() {
        return this.sigla;
    }

    public double getTasaConversion() {
        return this.tipoCambio;
    }
}
