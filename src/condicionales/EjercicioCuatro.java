// Leer un numero entero de dos digitos y determinar a cuanto es igual la suma de sus digitos

package condicionales;

public class EjercicioCuatro {

    private static int numero = 38;
    private static int sumaDigitos;

    public static void main(String[] args) {

        if (numero < 10 || numero > 99) {
            System.out.println("El número no es de dos digitos");
            return;
        } else {
            sumaDigitos = (numero % 10) + (numero / 10);
            System.out.println("La suma de los digitos es: " + sumaDigitos);
        }
    }
}
