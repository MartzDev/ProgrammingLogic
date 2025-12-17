package fundamentos.niveluno;

public class CalcularHoraMinutoSegundo {

    /*
     * Leer un valor en segundos.
     * Calcular cuántas horas, minutos y segundos representa ese valor.
     * 
     * Ejemplo:
     * - Total segundos: 350
     * - Resultado: 0 horas, 5 minutos, 50 segundos
     * 
     * Explicación de la solución:
     * Se utiliza la división entera para calcular las horas y minutos,
     * y el operador módulo (%) para obtener los segundos restantes.
     */

    private static int totalSegundos = 350;

    public static void main(String[] args) {

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Total de segundos: " + totalSegundos
                + "\nHoras: " + horas
                + "\nMinutos: " + minutos
                + "\nSegundos: " + segundos);
    }
}
