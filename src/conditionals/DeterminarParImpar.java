package conditionals;

public class DeterminarParImpar {

    /*
     * Leer un numero y deteminar si es par o impar.
     * 
     * Explicacion de la solucion: Un numero es par si al dividirlo entre 2
     * el residuo es 0 (numero % 2 == 0). Si el residuo es 1, el numero es impar.
     */

    private static int number = 123;

    public static void main(String[] args) {
        if (number % 2 == 0) {
            System.out.println("El numero " + number + " es par");
        } else {
            System.out.println("El numero " + number + " es impar");
        }
    }
}
