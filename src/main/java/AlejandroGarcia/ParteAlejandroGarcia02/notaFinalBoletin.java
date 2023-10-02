package AlejandroGarcia.ParteAlejandroGarcia02;

import java.util.Scanner;

import static AlejandroGarcia.ParteAlejandroGarcia02.obtengoNotaMedia.calcularNotaMedia;

public class notaFinalBoletin {

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

        System.out.print("Introduce la primera nota: ");
        int primeraNota = scanner.nextInt();

        System.out.print("Introduce la segunda nota: ");
        int segundaNota = scanner.nextInt();

        System.out.print("Introduce la tercera nota: ");
        int terceraNota = scanner.nextInt();

        double notaMedia = calcularNotaMedia(primeraNota, segundaNota, terceraNota);
        System.out.println(calcularNotaBoletin((notaMedia)) );
        scanner.close();
    }
}
