package ParteAlejandroGarcia04;

import java.util.Random;

public class ej10 {

    public static void main(String[] args) {
        String[] caracteres = {"*", "-", "=", ".", "|", "@"};
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int longitud = random.nextInt(40) + 1;
            String caracter = caracteres[random.nextInt(caracteres.length)];

            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }

            // Para meter un salto de línea en cada final de línea
            System.out.println();
        }
    }

}
