// Leer un numero entero de dos digitos y determinar si un digito es multiplo del otro

package condicionales;

public class EjercicioSiete {

    private static int nuemero = 20;
    private static int primerDigito = nuemero / 10;
    private static int ultimoDigito = nuemero % 10;

    public static void main(String[] args) {

        if (primerDigito == 0 || ultimoDigito == 0) {
            System.out.println("El número tiene al menos un digito igual a 0");
        } else {
            if (primerDigito % ultimoDigito == 0 || ultimoDigito % primerDigito == 0) {
                System.out.println("un digito es multiplo del otro");
            } else {
                System.out.println("Ningun digito es multiplo del otro");
            }
        }
    }
}
