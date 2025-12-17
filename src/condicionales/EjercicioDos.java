// Leer un numero entero y determinar si es de 3 digitos

package condicionales;

public class EjercicioDos {

    private static int numero = 999;

    public static void main(String[] args) {
        if (numero > 99 && numero < 1000) {
            System.out.println("El número es de 3 digitos");
        } else {
            System.out.println("El número no es de 3 digitos");
        }
    }
}
