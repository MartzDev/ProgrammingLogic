package conditionals;

public class VerificarMultiplo {
    /*
     * Leer dos números enteros (numero y divisor).
     * Determinar si el numero es múltiplo del divisor.
     * 
     * Ejemplo:
     * - Número: 15, Divisor: 5 → "15 es múltiplo de 5"
     * - Número: 17, Divisor: 5 → "17 NO es múltiplo de 5"
     * 
     * Explicación de la solución:
     * Se utiliza el operador módulo (%) para verificar si el residuo de la
     * división del número entre el divisor es cero. Si el residuo es cero,
     * entonces el número es múltiplo del divisor.
     */
    private static int numero = 15;
    private static int divisor = 5;

    public static void main(String[] args) {
        if (divisor == 0) {
            System.err.println("Error: el divisor no puede ser cero.");
        } else if (numero % divisor == 0) {
            System.out.println(numero + " es múltiplo de " + divisor);
        } else {
            System.out.println(numero + " NO es múltiplo de " + divisor);
        }
    }
}
