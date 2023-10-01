package ParteAlejandroGarcia02;

import java.util.Scanner;

public class saludoSegunHora {

    public static String saludar(int hora) {
        String saludo = "";
        if (hora >= 6 && hora <= 12) {
            saludo += "Buenos días";
        }
        else if(hora >= 13 && hora <= 20) {
            saludo += "Buenas tardes";
        }
        else {
            saludo += "Buenas noches";
        }
        return saludo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una hora sin los minutos: ");

        int hora = scanner.nextInt();
        System.out.println(saludar(hora));
        scanner.close();
    }

}
