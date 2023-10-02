package AlejandroGarcia.ParteAlejandroGarcia02;

import java.util.Scanner;


public class obtengoNotaMedia {

    public static double calcularNotaMedia(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int primerNum = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int segundoNum = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int tercerNum = scanner.nextInt();

        System.out.println(calcularNotaMedia(primerNum,segundoNum,tercerNum) );
        scanner.close();
    }
}