package ParteAlejandroGarcia02;
import java.util.Scanner;
public class comprobarPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero en el rango de 1 a 5 cifras: ");
        int num = scanner.nextInt();

        if (num >= 0 && num <= 99999) {
            String numeroAcadena = Integer.toString(num);
            String cadenaReves = "";


            for(int i = numeroAcadena.length() - 1; i >= 0; i--) {
                cadenaReves += numeroAcadena.charAt(i);
            }

            if (numeroAcadena.equals(cadenaReves)) {
                System.out.println("El número es palíndromo");
            }
            else {
                System.out.println("El número no es palíndromo");
            }

        } else {
            System.out.println("El número no se halla en el rango válido de 0 a 99999 .");
        }

        scanner.close();
    }

}
