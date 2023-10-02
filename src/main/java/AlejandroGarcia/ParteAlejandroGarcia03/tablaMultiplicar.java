package AlejandroGarcia.ParteAlejandroGarcia03;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int i= 0;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        scanner.close();
    }

}
