package ParteAlejandroGarcia04;


import java.util.Random;

public class llenaPantallaCaracteresRandom {

    public static void main(String[] args) {
        Random rand = new Random();

        while (true) {
            // Limpiamos la consola antes de posicionar el cursor
            System.out.print("\033[H\033[2J");

            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 130; j++) {
                    char randomChar = (char) (rand.nextInt(95) + 32);

                    System.out.print("\u001B[" + (rand.nextInt(25) + 1) + ";" + (rand.nextInt(130) + 1) + "H");

                    System.out.print(randomChar);

                    try {
                        // Esperamos 5 milisegundos para cada carácter
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Aquí se pasa a la siguiente línea tras terminar cada fila
                System.out.println();
            }

            try {
                // Pasan 50 milisegundos antes de sacar por pantalla el siguiente marco
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
