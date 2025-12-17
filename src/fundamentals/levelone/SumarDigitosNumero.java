package fundamentals.levelone;

public class SumarDigitosNumero {

    /*
     * Escribe un programa que sume los dígitos de un número de cualquier cifras.
     * Por
     * ejemplo, si el número es 7650, el programa debe mostrar 18 (7 + 6 + 5 + 0 =
     * 18).
     * Explicacion de la solución:
     * 1. Inicializar una variable para almacenar la suma de los dígitos.
     * 2. Usar un bucle para extraer cada dígito del número.
     * 3. En cada iteración, obtener el último dígito usando el operador módulo (%)
     * y añadirlo a la suma.
     * 4. Eliminar el último dígito del número dividiéndolo por 10.
     * 5. Repetir hasta que el número sea cero.
     * 6. Mostrar la suma de los dígitos.
     */

    private static int numero = 5543;
    private static int digito = 0;
    private static int acumulador = 0;

    public static void main(String[] args) {

        while (numero != 0) {
            digito = numero % 10;
            acumulador += digito;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos del número es: " + acumulador);
    }
}
