package AlejandroGarcia.ParteAlejandroGarcia02;

import java.util.Scanner;

public class numeroParYdivisibleEntre5 {

    public static boolean esNumPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esDivisibleEntre5(int numero) {
        return numero % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (esNumPar(numero)) {
            System.out.println("El número: " + numero + " es par.");
        } else {
            System.out.println("El número: " + numero + " es impar.");
        }

        if (esDivisibleEntre5(numero)) {
            System.out.println("El número: " + numero + " es divisible entre 5.");
        } else {
            System.out.println("El número: " + numero + " no es divisible entre 5.");
        }

        scanner.close();
    }
}
