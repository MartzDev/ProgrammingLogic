package conditionals;

public class DeterminarTresDigitos {

    /*
     * Leer un numero y determinar si tiene 3 digitos
     * Explicacion de la solucion: Un numero tiene 3 digitos si se encuentra en el
     * rango de 100 a 999.
     * Se utiliza la funcion Math.abs para considerar tambien numeros negativos.
     */

    private static int number = Math.abs(134);

    public static void main(String[] args) {

        if (number >= 100 && number <= 999) {
            System.out.println("El numero " + number + " tiene 3 digitos");
        } else {
            System.out.println("El numero " + number + " no tiene 3 digitos");
        }
    }
}
