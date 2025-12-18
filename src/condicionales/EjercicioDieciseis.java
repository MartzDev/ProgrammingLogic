// Leer un numero entero de tres digitos y determinar si algun digito es multiplo de otro

package condicionales;

public class EjercicioDieciseis {

    private static int numero = 257;
    private static int primerDigito = 0;
    private static int segundoDigito = 0;
    private static int tercerDigito = 0;
    private static boolean isMultiplo = false;

    public static void main(String[] args) {

        if (numero < 100 || numero > 999) {
            System.out.println("El numero debe ser de tres digitos");
            return;
        }

        primerDigito = numero / 100;
        segundoDigito = (numero / 10) % 10;
        tercerDigito = numero % 10;

        if ((segundoDigito != 0 && primerDigito % segundoDigito == 0)
                || (tercerDigito != 0 && primerDigito % tercerDigito == 0)
                || (primerDigito != 0 && segundoDigito % primerDigito == 0)
                || (tercerDigito != 0 && segundoDigito % tercerDigito == 0)
                || (primerDigito != 0 && tercerDigito % primerDigito == 0)
                || (segundoDigito != 0 && tercerDigito % segundoDigito == 0)) {
            isMultiplo = true;
        }

        if (isMultiplo) {
            System.out.println("Algun digito es multiplo de otro");
        } else {
            System.out.println("Algun digito no es multiplo de ninguno de los otros digitos");
        }
    }
}