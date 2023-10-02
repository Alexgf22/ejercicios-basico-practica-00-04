package AlejandroGarcia.ParteAlejandroGarcia03;

import java.util.Scanner;

public class mediaNnumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 0;
        int suma = 0;

        System.out.println("Introduce números positivos (introduce un número negativo para terminar)\n:");

        while (true) {
            int numero = new Integer(scanner.next());

            if (numero < 0) {
                break;
            }

            suma += numero;
            totalNumeros++;
        }

        if (totalNumeros > 0) {
            double media = (double) suma / totalNumeros;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        scanner.close();
    }

}
