package fundamentals.levelone;

public class DigitoMayor {

    /*
     * Escribe un programa que encuentre el dígito mayor en un número de cualquier
     * cantidad de cifras.
     * Por ejemplo, si el número es 98453, el programa debe mostrar 9.
     * Explicacion de la solución:
     * 1. Inicializar una variable para almacenar el dígito mayor.
     * 2. Usar un bucle para extraer cada dígito del número.
     * 3. En cada iteración, obtener el último dígito usando el operador módulo (%)
     * y compararlo con el dígito mayor almacenado.
     * 4. Si el dígito actual es mayor que el dígito mayor almacenado, actualizar el
     * dígito mayor.
     * 5. Eliminar el último dígito del número dividiéndolo por 10.
     * 6. Repetir hasta que el número sea cero.
     * 7. Mostrar el dígito mayor encontrado.
     */

    private static int numero = 98453;
    private static int digito = 0;
    private static int mayorDigito = 0;

    public static void main(String[] args) {
        while (numero != 0) {
            digito = numero % 10;
            if (digito > mayorDigito) {
                mayorDigito = digito;
            }
            numero /= 10;
        }
        System.out.println("El mayor dígito es: " + mayorDigito);
    }
}
