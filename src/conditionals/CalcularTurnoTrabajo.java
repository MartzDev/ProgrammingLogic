package conditionals;

public class CalcularTurnoTrabajo {

    /*
     * Leer la hora de inicio de un turno (formato 24h) y
     * la duración del turno en horas.
     * Calcular a qué hora termina el turno.
     * 
     * Ejemplo:
     * - Hora inicio: 21 (9 PM)
     * - Duración: 10 horas
     * - Resultado: 7 (7 AM del día siguiente)
     * 
     * Explicación de la solución:
     * Se utiliza el operador módulo (%) para ciclar las horas dentro del rango
     * de 0 a 23.
     */

    private static int horaInicio = 21;
    private static int duracionTurno = 10;
    private static int horaFinal = (horaInicio + duracionTurno) % 24;

    public static void main(String[] args) {
        System.out.println("Hora de inicio: " + horaInicio
                + "\nDuración del turno: " + duracionTurno
                + "\nHora de finalización del turno: " + horaFinal);
    }
}
