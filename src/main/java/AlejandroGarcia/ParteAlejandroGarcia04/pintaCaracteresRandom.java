package AlejandroGarcia.ParteAlejandroGarcia04;

import java.util.Random;

public class pintaCaracteresRandom {

    public static void main(String[] args) {
        String[] caracteres = {"*", "-", "=", ".", "|", "@"};
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int longitud = random.nextInt(40) + 1;
            String caracter = caracteres[random.nextInt(caracteres.length)];

            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }

}
