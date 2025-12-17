package fundamentos.niveluno;

public class InvertirNumeros {

    /*
     * Escribe un programa que invierta los dígitos de un número de tres cifras. Por
     * ejemplo, si el número es 278, el programa debe mostrar 872.
     * Explicacion de la solución:
     * 1. Obtener el último dígito del número original usando el operador módulo
     * (%).
     * 2. Dividir el número original por 10 para eliminar el último dígito.
     * 3. Repetir los pasos 1 y 2 para obtener el segundo y tercer dígito.
     * 4. Construir el número invertido multiplicando el primer dígito por 100, el
     * segundo por 10 y sumando el tercer dígito.
     * 5. Mostrar el número invertido.
     */

    private static int numeroOriginal = 987;
    private static int numeroUno = 0;
    private static int numeroDos = 0;
    private static int numeroTres = 0;
    private static int numeroInvertido = 0;

    public static void main(String[] args) {

        numeroUno = numeroOriginal % 10; // Obtener el último dígito
        numeroOriginal /= 10; // Eliminar el último dígito

        numeroDos = numeroOriginal % 10;
        numeroOriginal /= 10;

        numeroTres = numeroOriginal;

        numeroInvertido = numeroUno * 100 + numeroDos * 10 + numeroTres;

        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
