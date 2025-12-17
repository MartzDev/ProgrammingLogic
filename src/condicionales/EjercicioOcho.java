// Leer un numero entero de dos digitos y determinar si los dos digitos son iguales

package condicionales;

public class EjercicioOcho {

    private static int numero = 10;
    private static int primerDigito = numero / 10;
    private static int ultimoDigito = numero % 10;

    public static void main(String[] args) {
        if (numero < 10 || numero > 99) {
            System.out.println("El número no es de dos digitos");
            return;
        }
        if (primerDigito == ultimoDigito) {
            System.out.println("Los digitos son iguales");
        } else {
            System.out.println("Los digitos son diferentes");
        }
    }
}
