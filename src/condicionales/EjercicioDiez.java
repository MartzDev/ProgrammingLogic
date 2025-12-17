// Leer dos numeros enteros de dos digitos y determinar si tienen digitos comunes

package condicionales;

public class EjercicioDiez {

    private static int primerNumero = 25;
    private static int segundoNumero = 32;
    private static int primerDigitoPrimerNumero = primerNumero / 10;
    private static int segundoDigitoPrimerNumero = primerNumero % 10;
    private static int primerDigitoSegundoNumero = segundoNumero / 10;
    private static int segundoDigitoSegundoNumero = segundoNumero % 10;

    public static void main(String[] args) {

        if ((primerNumero < 10 || primerNumero > 99) || (segundoNumero < 10 || segundoNumero > 99)) {
            System.out.println("Ambos numeros deben ser de dos digitos");
            return;
        } else {
            if (primerDigitoPrimerNumero == primerDigitoSegundoNumero
                    || primerDigitoPrimerNumero == segundoDigitoSegundoNumero ||
                    segundoDigitoPrimerNumero == primerDigitoSegundoNumero
                    || segundoDigitoPrimerNumero == segundoDigitoSegundoNumero) {
                System.out.println("Hay digitos iguales entre los dos numeros");
            } else {
                System.out.println("No hay digitos iguales entre los dos numeros");

            }
        }
    }
}
