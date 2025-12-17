// Leer un numero entero de dos digitos y determinar si un digito es multiplo del otro

package condicionales;

public class EjercicioSiete {

    private static int numero = 22;
    private static int primerDigito = numero / 10;
    private static int ultimoDigito = numero % 10;

    public static void main(String[] args) {

        if (numero < 10 || numero > 100) {
            System.out.println("El número no es de dos digitos");
        } else {
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
}
