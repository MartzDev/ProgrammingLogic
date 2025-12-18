// Leer un numero entero de tres digitos y determinar en que posicion se encuentra el digito mayor

package condicionales;

public class EjercicioQuince {

    private static int numero = 133;
    private static int primerDigito = 0;
    private static int segundoDigito = 0;
    private static int tercerDigito = 0;
    private static int indicePrimerDigito = 0;
    private static int indiceSegundoDigito = 1;
    private static int indiceTercerDigito = 2;

    public static void main(String[] args) {
        if (numero < 100 || numero > 999) {
            System.out.println("El numero debe ser de tres digitos");
            return;
        }

        primerDigito = numero / 100;
        segundoDigito = (numero / 10) % 10;
        tercerDigito = numero % 10;

        if (primerDigito >= segundoDigito && primerDigito >= tercerDigito) {
            System.out.println("La posicion del digito mayor es: " + indicePrimerDigito);
        } else if (segundoDigito >= primerDigito && segundoDigito >= tercerDigito) {
            System.out.println("La posicion del digito mayor es: " + indiceSegundoDigito);
        } else {
            System.out.println("La posicion del digito mayor es: " + indiceTercerDigito);
        }

    }
}
