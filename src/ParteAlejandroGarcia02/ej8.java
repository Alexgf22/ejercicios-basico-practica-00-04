package ParteAlejandroGarcia02;

import java.util.Scanner;

// TODO exportar la nota media del ej 7 de maurice
public class ej8 {

    public static String calcularNotaBoletin(double notaMedia) {
        String notaBoletin = "";
        if(notaMedia < 5.0) {
            notaBoletin += "insuficiente";
        } else if (notaMedia >= 5.0 && notaMedia < 6.0) {
            notaBoletin += "suficiente";
        }
        else if (notaMedia >= 6.0 && notaMedia < 7.0) {
            notaBoletin += "bien";
        }
        else if (notaMedia >= 7.0 && notaMedia < 9) {
            notaBoletin += "notable";
        }
        else {
            notaBoletin += "sobresaliente";
        }
        return notaBoletin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota media: ");

        double notaMedia = scanner.nextInt();
        System.out.println(calcularNotaBoletin((notaMedia)) );
        scanner.close();
    }
}
