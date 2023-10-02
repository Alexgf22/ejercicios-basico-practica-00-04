package ParteAlejandroGarcia03;

import java.util.Scanner;

public class comprobarNumPrimo {

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero para comprobar si es primo o no: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
        scanner.close();
    }

}
