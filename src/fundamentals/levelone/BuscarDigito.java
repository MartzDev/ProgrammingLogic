package fundamentals.levelone;

public class BuscarDigito {

    /*
     * Programa que busca un dígito específico dentro de un número entero.
     * Si el dígito es encontrado, se imprime un mensaje indicando su presencia;
     * de lo contrario, se indica que no fue encontrado.
     */

    private static int numero = 2957;
    private static int digito = 0;
    private static int buscarNumero = 7;
    private static boolean isEncontrado = false;

    public static void main(String[] args) {
        while (numero != 0) {
            digito = numero % 10;
            if (digito == buscarNumero) {
                isEncontrado = true;
                break;
            }
            numero = numero / 10;
        }
        if (isEncontrado) {
            System.out.println("El dígito " + buscarNumero + " fue encontrado");
        } else {
            System.out.println("El dígito " + buscarNumero + " no fue encontrado");
        }
    }
}
