package conditionals;

public class DeterminarUltimoNumero {

    /*
     * Ejercicio: leer un numero entero y determinar si es un numero que termina en
     * 4.
     * 
     * Explicacion de la solucion: El operador módulo es muy útil en programación
     * porque:
     * Permite extraer el último dígito de un número entero (mod 10).
     * Permite ciclar valores dentro de un rango específica, como por ejemplo
     * horas del dia (mod 24, 0-23), letras de alfabeto (mod 26, A-Z), dias de la
     * semana (mod 7, 0-6), etc.
     */

    private static int number = 8764;

    public static void main(String[] args) {
        if (number % 10 == 4) {
            System.out.println("El numero " + number + " termina en 4");
        } else {
            System.out.println("El numero " + number + " no termina en 4");
        }
    }
}
