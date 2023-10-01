package ParteAlejandroGarcia03;

import java.util.Scanner;

public class piramideHueca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        System.out.print("Introduce el carácter con el que pintar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }


}
