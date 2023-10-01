package ParteAlejandroGarcia04;

import java.util.Random;
import java.util.Scanner;

public class ej14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int intentos = 5;
        int min = 0;
        int max = 100;
        int intentoNumero;
        String respuesta;

        System.out.println("Piensa en un número del rango de 0 a 100 e intentaré adivinarlo.");

        do {
            intentoNumero = rand.nextInt(max - min + 1) + min;
            System.out.println("¿Es " + intentoNumero + " el número que estás pensando? (si/no)");
            respuesta = scanner.nextLine();

            if (respuesta.equals("si")) {
                System.out.println("¡He conseguido adivinar el número!");
                break;
            } else {
                System.out.println("¿Es tu número mayor o menor que " + intentoNumero + "? (mayor/menor)");
                respuesta = scanner.nextLine();

                if (respuesta.equals("mayor")) {
                    min = intentoNumero + 1;
                } else if (respuesta.equals("menor")) {
                    max = intentoNumero - 1;
                } else {
                    System.out.println("La respuesta no es válida. Debes introducir 'mayor' o 'menor'.");
                }
            }

            intentos--;

            if (intentos == 0) {
                System.out.println("Vaya :( he acabado mis intentos. No he podido adivinarlo.");
            }

        } while (intentos > 0);
    }

}
