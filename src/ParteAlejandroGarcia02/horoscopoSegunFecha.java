package ParteAlejandroGarcia02;

import java.util.Scanner;

public class horoscopoSegunFecha {

    public static String obtenerHoroscopo(int dia, int mes) {

        String horoscopo;

        switch (mes) {
            case 1:
                // Si el dia es <= 20 elige Capricornio, sino , elige Acuario
                horoscopo = (dia <= 20) ? "Capricornio" : "Acuario";
                break;
            case 2:
                horoscopo = (dia <= 18) ? "Acuario" : "Piscis";
                break;
            case 3:
                horoscopo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4:
                horoscopo = (dia <= 19) ? "Aries" : "Tauro";
                break;
            case 5:
                horoscopo = (dia <= 20) ? "Tauro" : "Géminis";
                break;
            case 6:
                horoscopo = (dia <= 20) ? "Géminis" : "Cáncer";
                break;
            case 7:
                horoscopo = (dia <= 21) ? "Cáncer" : "Leo";
                break;
            case 8:
                horoscopo = (dia <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                horoscopo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                horoscopo = (dia <= 22) ? "Libra" : "Escorpio";
                break;
            case 11:
                horoscopo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                horoscopo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                horoscopo = "Mes no válido";
        }

        return horoscopo;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes de nacimiento (en entero del rango de 1-12): ");
        int mes = scanner.nextInt();

        System.out.println("El horóscopo que te corresponde según tu fecha de nacimiento es: " + obtenerHoroscopo(dia,mes) );
        scanner.close();
    }
}
