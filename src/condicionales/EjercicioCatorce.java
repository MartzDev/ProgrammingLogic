// Leer un numero entero de tres digitos y determinar si al menos dos de sus tres digitos son iguales

package condicionales;

public class EjercicioCatorce {

    private static int numero = 131;
    private static int primerDigito = 0;
    private static int segundoDigito = 0;
    private static int tercerDigito = 0;

    public static void main(String[] args) {

        if (numero < 100 || numero > 999) {
            System.out.println("El numero debe ser de tres digitos");
            return;
        }

        primerDigito = numero / 100;
        segundoDigito = (numero / 10) % 10;
        tercerDigito = numero % 10;

        if (primerDigito == segundoDigito || primerDigito == tercerDigito
                || segundoDigito == tercerDigito) {
            System.out.println("El numero tiene al menos dos digitos iguales");
        } else {
            System.out.println("El numero no tiene digitos iguales");
        }
    }
}
