// Leer un numero entero de tres digitos y determinar a cuanto es igual la suma de sus digitos

package condicionales;

public class EjercicioTrece {

    private static int numero = 550;
    private static int primerDigito = 0;
    private static int segundoDigito = 0;
    private static int tercerDigito = 0;
    private static int sumaDigitos = 0;

    public static void main(String[] args) {
        if (numero < 100 || numero > 999) {
            System.out.println("El numero debe ser de tres digitos");
            return;
        }

        primerDigito = numero / 100;
        segundoDigito = (numero / 10) % 10;
        tercerDigito = numero % 10;
        sumaDigitos = primerDigito + segundoDigito + tercerDigito;

        System.out.println("La suma de sus digitos es " + sumaDigitos);
    }
}
