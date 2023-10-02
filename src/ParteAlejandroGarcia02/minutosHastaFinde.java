package ParteAlejandroGarcia02;

import java.util.Scanner;

public class minutosHastaFinde {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un día de la semana de lunes a viernes: ");
        String diaSemana = scanner.next();

        System.out.print("Introduce la hora: ");
        int hora = scanner.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();

        switch (diaSemana) {
            case "lunes":
                int horasRestantes = 23 - hora;
                horasRestantes *= 60;
                int minutosRestantes = 60 - minutos;
                // Aquí sumamos cuántos minutos quedan para terminar el lunes
                int totalMinutosLunes = horasRestantes + minutosRestantes;

                // Ahora sumamos los minutos del martes al viernes a las 15:00
                int totalMins1 = (24*60) * 3;
                int totalMinsViernes = 15 * 60;
                // Ahora sumamos todos los minutos de lo que hemos calculado
                int totalMinsFinal = totalMinutosLunes + totalMins1 + totalMinsViernes;
                System.out.println("Faltan desde el: " + diaSemana + " a las  " + hora + ":" + minutos +  " para el viernes a las 15:00 : " + totalMinsFinal + " minutos");
                break;

            case "martes":
                int horasRestantesMartes = 23 - hora;
                horasRestantesMartes *= 60;
                int minutosRestantesMartes = 60 - minutos;
                // Aquí sumamos cuántos minutos quedan para terminar el martes
                int totalMinutosMartes = horasRestantesMartes + minutosRestantesMartes;

                // Ahora sumamos los minutos del miércoles al viernes a las 15:00
                int totalMins2 = (24*60) * 2;
                int totalMinsViernes2 = 15 * 60;
                // Ahora sumamos todos los minutos de lo que hemos calculado
                int totalMinsFinal2 = totalMinutosMartes + totalMins2 + totalMinsViernes2;
                System.out.println("Faltan desde el: " + diaSemana + " a las  " + hora + ":" + minutos +  " para el viernes a las 15:00 : " + totalMinsFinal2 + " minutos");
                break;

            case "miercoles":
                int horasRestantesMiercoles = 23 - hora;
                horasRestantesMiercoles *= 60;
                int minutosRestantesMiercoles = 60 - minutos;
                // Aquí sumamos cuántos minutos quedan para terminar el miercoles
                int totalMinutosMiercoles = horasRestantesMiercoles + minutosRestantesMiercoles;

                // Ahora sumamos los minutos del jueves al viernes a las 15:00
                int totalMins3 = (24 * 60);
                int totalMinsViernes3 = 15 * 60;
                // Ahora sumamos todos los minutos de lo que hemos calculado
                int totalMinsFinal3 = totalMinutosMiercoles + totalMins3 + totalMinsViernes3;
                System.out.println("Faltan desde el: " + diaSemana + " a las  " + hora + ":" + minutos +  " para el viernes a las 15:00 : " + totalMinsFinal3 + " minutos");

                break;

            case "jueves":
                int horasRestantesJueves = 23 - hora;
                horasRestantesJueves *= 60;
                int minutosRestantesJueves = 60 - minutos;
                // Aquí sumamos cuántos minutos quedan para terminar el jueves
                int totalMinutosJueves = horasRestantesJueves + minutosRestantesJueves;

                // Ahora sumamos los minutos del viernes hasta las 15:00
                int totalMinsViernes4 = 15 * 60;
                // Ahora sumamos todos los minutos de lo que hemos calculado
                int totalMinsFinal4 = totalMinutosJueves + totalMinsViernes4;
                System.out.println("Faltan desde el: " + diaSemana + " a las  " + hora + ":" + minutos +  " para el viernes a las 15:00 : " + totalMinsFinal4 + " minutos");

                break;

            case "viernes":
                int horasRestantesViernes = 14 - hora;
                horasRestantesViernes *= 60;
                int minutosRestantesViernes = 60 - minutos;
                // Aquí sumamos cuántos minutos quedan para llegar hasta las 15:00 del viernes
                int totalMinutosViernes = horasRestantesViernes + minutosRestantesViernes;

                System.out.println("Faltan desde el: " + diaSemana + " a las  " + hora + ":" + minutos +  " para el viernes a las 15:00 : " + totalMinutosViernes + " minutos");

                break;

            default:
                System.out.println("El día no se encuentra del rango de lunes-viernes");
        }




        scanner.close();
    }
}
