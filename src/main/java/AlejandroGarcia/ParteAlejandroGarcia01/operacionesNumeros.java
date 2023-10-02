package AlejandroGarcia.ParteAlejandroGarcia01;

import java.util.Scanner;

public class operacionesNumeros {

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("La suma de: " + num1 + " y " + num2 + " es igual a " + sumar(num1,num2));
        System.out.println("La resta de: " + num1 + " y " + num2 + " es igual a " + restar(num1,num2));
        System.out.println("La multiplicación de: " + num1 + " y " + num2 + " es igual a " + multiplicacion(num1,num2));
        System.out.println("La división de: " + num1 + " y " + num2 + " es igual a " + division(num1,num2));

        scanner.close();
    }
}
