package condicionales;

public class GenerarLetrasAlfabeto {
    /*
     * Leer un número entero y convertirlo en una letra del alfabeto (A-Z).
     * Si el número es mayor a 25, debe ciclar de vuelta a la A.
     * 
     * Ejemplo:
     * - Número: 0 → A
     * - Número: 25 → Z
     * - Número: 26 → A
     * - Número: 28 → C
     * 
     * Explicación de la solución:
     * Se utiliza el operador módulo (%) para ciclar los números dentro del rango
     * de 0 a 25, y luego se convierte ese número en su correspondiente letra
     * sumando el valor ASCII de 'A'.
     */

    private static int numero = 25;
    private static char letraFinal = (char) ('A' + (numero % 26));

    public static void main(String[] args) {
        System.out.println("Numero: " + numero + " → Letra: " + letraFinal);
    }
}
