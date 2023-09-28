package ParteAlejandroGarcia01;
import java.util.Scanner;

/*
Ejercicio 2
Realiza un conversor de euros a pesetas.
La cantidad de euros que se quiere convertir debe ser
introducida por teclado.
 */
public class ej2 {

    public static double conversor(int euros) {
        return 166.386 * euros;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros a convertir: ");
        int euros = scanner.nextInt();
        System.out.println(euros + "€ " +"son "+ conversor(euros) + " pesetas");
        scanner.close();
    }
}
