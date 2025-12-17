// Leer un numero entero de dos digitos menor que 20 y determinar si es primo

package condicionales;

public class EjercicioSeis {

    private static int numero = 11;

    public static void main(String[] args) {
        if (numero < 10 || numero > 19) {
            System.out.println("El número debe ser de dos digitos y menor que 20");
            return;
        }
        if (numero > 1 && numero < 20) {
            if (numero == 2 || numero == 3 || numero == 5 || numero == 7 || numero == 11 || numero == 13 || numero == 17
                    || numero == 19) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo, es compuesto");
            }
        } else {
            System.out.println("El número debe ser mayor a 1 y menor a 20");
        }
    }
}
