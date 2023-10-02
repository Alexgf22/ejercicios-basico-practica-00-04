package AlejandroGarcia.ParteAlejandroGarcia03;

import java.util.ArrayList;
import java.util.Scanner;

public class serieFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nº de términos de la serie de Fibonacci que deseas mostrar: ");
        int n = scanner.nextInt();

        int primerTermino = 0;
        int segundoTermino = 1;

        System.out.print("Quedaría la serie de Fibonacci: " + primerTermino + ", " + segundoTermino);

        for (int i = 2; i < n; i++) {
            int siguienteTermino = primerTermino + segundoTermino;
            System.out.print(", " + siguienteTermino);

            primerTermino = segundoTermino;
            segundoTermino = siguienteTermino;
        }

        scanner.close();
    }

}
