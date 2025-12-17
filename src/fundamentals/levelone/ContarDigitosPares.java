package fundamentals.levelone;

public class ContarDigitosPares {

    /*
     * Escribe un programa que cuente los dígitos pares de un número de cualquier
     * cifras.
     * Por ejemplo, si el número es 45721, el programa debe mostrar 2 (porque hay
     * dos dígitos pares: 4 y 2).
     * Explicacion de la solución:
     * 1. Inicializar una variable para contar los dígitos pares.
     * 2. Usar un bucle para extraer cada dígito del número.
     * 3. En cada iteración, obtener el último dígito usando el operador módulo (%).
     * 4. Verificar si el dígito es par (dígito % 2 == 0).
     * 5. Si es par, incrementar el contador.
     * 6. Eliminar el último dígito del número dividiéndolo por 10.
     * 7. Repetir hasta que el número sea cero.
     * 8. Mostrar la cantidad de dígitos pares encontrados.
     */

    private static int numero = 45721;
    private static int digito = 0;
    private static int contadorPares = 0;

    public static void main(String[] args) {
        while (numero != 0) {
            digito = numero % 10;
            if (digito % 2 == 0) {
                contadorPares++;
            }
            numero /= 10;
        }
        System.out.println("La cantidad de dígitos pares es: " + contadorPares);
    }
}
