package fundamentos.niveluno;

public class DeterminarAnioBisiesto {

    /*
     * Leer un año y determinar si es bisiesto.
     * 
     * Ejemplo:
     * - Año: 2020 → "2020 es un año bisiesto"
     * - Año: 2021 → "2021 no es un año bisiesto"
     * Explicación de la solución:
     * Un año es bisiesto si es divisible entre 4, pero no entre 100,
     * a menos que también sea divisible entre 400
     */

    private static int numero = 2020;

    public static void main(String[] args) {

        if (numero % 4 == 0 && (numero % 100 != 0 || numero % 400 == 0)) {
            System.out.println("" + numero + " es un año bisiesto.");
        } else {
            System.out.println("" + numero + " no es un año bisiesto.");
        }
    }
}
