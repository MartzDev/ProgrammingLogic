package conditionals;

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
     */

    private static int numero = 25;
    private static char letraFinal = (char) ('A' + (numero % 26));

    public static void main(String[] args) {
        System.out.println("Numero: " + numero + " → Letra: " + letraFinal);
    }
}
