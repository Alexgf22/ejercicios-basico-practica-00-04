package AlejandroGarcia.ParteAlejandroGarcia03;

import java.util.Scanner;

public class pontenciaNumero {

    public static int calcularPotencia(int base, int exponente) {
        int i = 1;
        int resultado = base;
        while(i < exponente) {
            resultado *= base;
            i++;
        }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base (entero positivo): ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        System.out.println(calcularPotencia(base, exponente));
        scanner.close();
    }
}
