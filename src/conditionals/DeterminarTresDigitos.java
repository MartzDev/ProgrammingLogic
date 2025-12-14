package conditionals;

public class DeterminarTresDigitos {

    /*
     * Leer un numero y determinar si tiene 3 digitos.
     * 
     * Explicacion de la solucion: Un numero tiene 3 digitos si se encuentra en el
     * rango de 100 a 999.
     * Se utiliza la funcion Math.abs para considerar tambien numeros negativos.
     */

    private static int numero = Math.abs(134);

    public static void main(String[] args) {

        if (numero >= 100 && numero <= 999) {
            System.out.println("El numero " + numero + " tiene 3 digitos");
        } else {
            System.out.println("El numero " + numero + " no tiene 3 digitos");
        }
    }
}
