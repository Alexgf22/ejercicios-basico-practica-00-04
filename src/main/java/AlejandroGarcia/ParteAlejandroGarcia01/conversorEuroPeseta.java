package AlejandroGarcia.ParteAlejandroGarcia01;
import java.util.Scanner;

/*
Ejercicio 2
Realiza un conversor de euros a pesetas.
La cantidad de euros que se quiere convertir debe ser
introducida por teclado.
 */

public class conversorEuroPeseta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        double euroApesetas = 166.386;
        double pesetas = euros * euroApesetas;

        System.out.println(euros + " euros al cambio son:  " + pesetas + " pesetas.");
    }
}

