// Leer un numero entero de dos digitos y determinar si los dos digitos son iguales

package condicionales;

public class EjercicioOcho {

    private static int numero = 21;
    private static int primerDigito = numero / 10;
    private static int ultimoDigito = numero % 10;

    public static void main(String[] args) {
        if (primerDigito == ultimoDigito) {
            System.out.println("Los digitos son iguales");
        } else {
            System.out.println("Los digitos son diferentes");
        }
    }
}
