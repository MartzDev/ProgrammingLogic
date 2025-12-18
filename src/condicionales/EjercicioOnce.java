// Leer dos numeros enteros de dos digitos y determinar si la suma de los dos numeros origina un numero par

package condicionales;

public class EjercicioOnce {

    private static int primerNumero = 22;
    private static int segundoNumero = 22;
    private static int totalSuma = 0;

    public static void main(String[] args) {

        if ((primerNumero < 10 || primerNumero > 99) || (segundoNumero < 10 || segundoNumero > 99)) {
            System.out.println("Ambos numeros deben ser de dos digitos");
            return;
        }

        totalSuma = primerNumero + segundoNumero;

        if (totalSuma % 2 == 0) {
            System.out.println("La suma de los dos numeros es par");
        } else {
            System.out.println("La suma de los dos numeros es impar");
        }
    }
}
