package ParteAlejandroGarcia02;

import java.util.Scanner;

public class primeraCifraNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero en el rango de 1 a 5 cifras: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 99999) {
            String numeroAcadena = Integer.toString(numero);

            // Extraemos el primer carácter de la cadena lo que sería la 1º cifra
            char primeraCifra = numeroAcadena.charAt(0);

            System.out.println("La primera cifra del número sería: " + primeraCifra);
        } else {
            System.out.println("El número no se halla en el rango válido de 0 a 99999 .");
        }

        scanner.close();
    }

}
