// Leer dos numeros enteros de dos digitos y determinar a cuanto es igual la suma de todos los digitos

package condicionales;

public class EjercicioDoce {

    private static int primerNumero = 40;
    private static int segundoNumero = 20;
    private static int primerDigitoPrimerNumero = 0;
    private static int segundoDigitoPrimerNumero = 0;
    private static int primerDigitoSegundoNumero = 0;
    private static int segundoDigitoSegundoNumero = 0;
    private static int totlaSumaDigitos = 0;

    public static void main(String[] args) {
        if ((primerNumero < 10 || primerNumero > 99) || (segundoNumero < 10 || segundoNumero > 99)) {
            System.out.println("Ambos numeros deben ser de dos digitos");
            return;
        } else {
            primerDigitoPrimerNumero = primerNumero / 10;
            segundoDigitoPrimerNumero = primerNumero % 10;
            primerDigitoSegundoNumero = segundoNumero / 10;
            segundoDigitoSegundoNumero = segundoNumero % 10;
            totlaSumaDigitos = primerDigitoPrimerNumero + segundoDigitoPrimerNumero + primerDigitoSegundoNumero
                    + segundoDigitoSegundoNumero;

            System.out.println("La suma de todos los digitos es: " + totlaSumaDigitos);
        }
    }
}
