package ParteAlejandroGarcia02;

import java.util.Scanner;

public class ej6 {
    public static double tiempoCaida(int alturaObjeto) {
        double tiempo;
        tiempo = Math.sqrt( (2*alturaObjeto)/9.81 );
        return Math.round(tiempo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura a la que cae el objeto: ");

        int alturaObjeto = scanner.nextInt();
        System.out.println("El tiempo que tarda en caer un objeto desde: " + alturaObjeto + " metros" + " será de: " + tiempoCaida(alturaObjeto));
        scanner.close();
    }
}
