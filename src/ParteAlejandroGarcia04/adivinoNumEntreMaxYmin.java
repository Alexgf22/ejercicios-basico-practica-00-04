package ParteAlejandroGarcia04;

import java.util.Random;
import java.util.Scanner;

public class adivinoNumEntreMaxYmin {

    public static int obtenerNumAleatorio() {

        int minimo = 0;
        int maximo = 100;

        Random random = new Random();

        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAleatorio = obtenerNumAleatorio();
        int oportunidades = 5;

        while (true) {
            System.out.print("Introduzca un número del 0 al 100 para intentar adivinarlo: ");
            int intentoNumero = scanner.nextInt();

            if (intentoNumero == numAleatorio) {
                System.out.print("¡Felicidades has acertado :) !");
                break;
            } else {
                oportunidades -= 1;
                if (oportunidades == 0) {
                    System.out.println("Lo siento te has quedado sin oportunidades :( , el número que buscábamos era: " + numAleatorio);
                    break;
                }
                System.out.println("Lo siento :(  has fallado te quedan: " + oportunidades + " oportunidades");

                if (intentoNumero > numAleatorio) {
                    System.out.println("El número que buscamos es menor");
                } else {
                    System.out.println("El número que buscamos es mayor");
                }
            }
        }


        scanner.close();

    }

}
