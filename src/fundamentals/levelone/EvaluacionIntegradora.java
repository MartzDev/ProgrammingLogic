package fundamentals.levelone;

public class EvaluacionIntegradora {

    /*
     * Analizador completo de un número
     * Escribe un programa que:
     * Reciba un número entero positivo (ejemplo: 48372)
     * 
     * Calcule y muestre:
     * La suma de todos sus dígitos
     * Cuántos dígitos pares tiene
     * Cuántos dígitos impares tiene
     * El dígito mayor
     * El dígito menor
     * 
     * Por ejemplo:
     * Entrada: 48372
     * 
     * Salida:
     * Suma de dígitos: 24 (4+8+3+7+2)
     * Dígitos pares: 3 (4, 8, 2)
     * Dígitos impares: 2 (3, 7)
     * Dígito mayor: 8
     * Dígito menor: 2
     */

    private static int numero = 48372;
    private static int sumarDigitos = 0;
    private static int digitoExtraido = 0;
    private static int contadorPares = 0;
    private static int contadorImpares = 0;
    private static int mayorDigito = 0;
    private static int menorDigito = 9;

    public static void main(String[] args) {

        while (numero != 0) {

            digitoExtraido = numero % 10;
            sumarDigitos += digitoExtraido;

            if (digitoExtraido % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }

            if (digitoExtraido < menorDigito) {
                menorDigito = digitoExtraido;
            }

            if (digitoExtraido > mayorDigito) {
                mayorDigito = digitoExtraido;
            }

            numero /= 10;
        }

        System.out.println("Suma de dígitos: " + sumarDigitos
                + "\nDígitos pares: " + contadorPares
                + "\nDígitos impares: " + contadorImpares
                + "\nDígito mayor: " + mayorDigito
                + "\nDígito menor: " + menorDigito);
    }
}
