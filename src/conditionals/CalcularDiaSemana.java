package conditionals;

public class CalcularDiaSemana {
    /*
     * Leer un día de la semana (0=Domingo, 1=Lunes, ..., 6=Sábado)
     * y una cantidad de días a sumar.
     * Calcular qué día de la semana será después de sumar esos días.
     * 
     * Ejemplo:
     * - Día actual: 5 (Viernes)
     * - Días a sumar: 4
     * - Resultado: 2 (Martes)
     * explicación de la solución:
     * Se utiliza el operador módulo (%) para ciclar los días dentro del rango
     * de 0 a 6.
     * 
     * Explicacion de la solución:
     * 1. Se suma el día actual (5) con los días a sumar (4), obteniendo 9.
     * 2. Se aplica el operador módulo 7 a 9, lo que da como resultado 2.
     * 3. El resultado (2) corresponde a Martes.
     */

    private static int diaActual = 5;
    private static int diasASumar = 4;
    private static int diaFinal = (diaActual + diasASumar) % 7;

    public static void main(String[] args) {
        switch (diaFinal) {
            case 0:
                System.out.println(diaFinal + " (Domingo)");
                break;
            case 1:
                System.out.println(diaFinal + " (Lunes)");
                break;
            case 2:
                System.out.println(diaFinal + " (Martes)");
                break;
            case 3:
                System.out.println(diaFinal + " (Miércoles)");
                break;
            case 4:
                System.out.println(diaFinal + " (Jueves)");
                break;
            case 5:
                System.out.println(diaFinal + " (Viernes)");
                break;
            case 6:
                System.out.println(diaFinal + " (Sábado)");
                break;
            default:
                System.err.println("Día inválido");
        }
    }
}