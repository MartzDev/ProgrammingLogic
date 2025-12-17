// Leer un numero entero de dos digitos y determinar si ambos digitos son pares
package condicionales;

public class EjercicioCinco {

    private static int numero = 32;
    private static int digitoUno;
    private static int digitoDos;
    private static boolean isParesDigitos;

    public static void main(String[] args) {
        digitoUno = numero / 10;
        digitoDos = numero % 10;

        isParesDigitos = (digitoUno % 2 == 0) && (digitoDos % 2 == 0);

        System.out.println(isParesDigitos ? "Ambos digitos son pares" : "Al menos un digito no es par");
    }
}
