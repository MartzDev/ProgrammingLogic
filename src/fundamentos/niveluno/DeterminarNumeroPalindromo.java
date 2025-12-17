package fundamentos.niveluno;

public class DeterminarNumeroPalindromo {

    /*
     * Escribe un programa que determine si un número de tres cifras es un
     * palíndromo. Un número es un palíndromo si se lee igual de izquierda a derecha
     * que de derecha a izquierda. Por ejemplo, 121 es un palíndromo, mientras que
     * 123 no lo es.
     * Explicacion de la solución:
     * 1. Obtener el primer dígito del número dividiéndolo por 100.
     * 2. Obtener el último dígito del número usando el operador módulo (%).
     * 3. Comparar el primer y el último dígito.
     * 4. Si son iguales, el número es un palíndromo; de lo contrario, no lo es.
     */

    private static int numero = 122;
    private static int primerDigito = 0;
    private static int ultimoDigito = 0;
    private static boolean isPalindromo = false;

    public static void main(String[] args) {

        primerDigito = numero / 100; // Quitar los dos últimas digitos
        ultimoDigito = numero % 10; // Obtener el último dígito

        isPalindromo = (primerDigito == ultimoDigito);

        if (isPalindromo) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }
    }
}
