// Leer dos numeros enteros y determinar cual es el mayor

package condicionales;

public class EjerciciioNueve {

    private static int primerNumero = 24;
    private static int segundoNumero = 12;

    public static void main(String[] args) {
        if (primerNumero > segundoNumero) {
            System.out.println("El numero mayor es: " + primerNumero);
        } else if (segundoNumero > primerNumero) {
            System.out.println("El numero mayor es: " + segundoNumero);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
