// Leer un numero entero y determinar si es un numero terminado en 4

package condicionales;

public class EjercicioUno {
    private static int numero = 774;

    public static void main(String[] args) {
        if (numero % 10 == 4) {
            System.out.println("Termina en 4");
        } else {
            System.out.println("No termina en 4");
        }
    }
}
