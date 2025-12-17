package condicionales;

public class CalcularHoras {

    /*
     * Leer una hora actual (0-23) y una cantidad de horas a sumar.
     * Calcular a qué hora será después de sumar esas horas,
     * considerando que el día tiene 24 horas y debe ciclar correctamente.
     * Mostrar el resultado en formato 24h, pero indicar si es AM o PM.
     * 
     * Reglas:
     * - 0-11: AM (madrugada y mañana)
     * - 12-23: PM (tarde y noche)
     * 
     * Ejemplos:
     * - Hora actual: 22, Sumar: 5 → Resultado: 3 (3 AM)
     * - Hora actual: 10, Sumar: 8 → Resultado: 18 (18 PM / 6 PM)
     * - Hora actual: 14, Sumar: 3 → Resultado: 17 (17 PM / 5 PM)
     * - Hora actual: 23, Sumar: 2 → Resultado: 1 (1 AM)
     * 
     * Explicación de la solución:
     * Se utiliza el operador módulo (%) para ciclar las horas dentro del rango
     * de 0 a 23.
     */

    private static int horaActual = 24;
    private static int horasASumar = 10;

    public static void main(String[] args) {
        int horaFinal = (horaActual + horasASumar) % 24;
        String ampm = (horaFinal >= 12) ? "PM" : "AM";
        System.out.println("La hora final es: " + horaFinal + " (" + ampm + ")");
    }
}
