package AlejandroGarcia.ParteAlejandroGarcia04;

import java.util.Random;

public class numsAleatoriosDeArray {

    public static String obtenerNums() {
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};


        Random random = new Random();
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while(i <= 20) {
            int indiceAleatorio = random.nextInt(numeros.length);
            String numAleatorio = numeros[indiceAleatorio];
            resultado.append(numAleatorio).append(" ");
            i++;
        }

        return resultado.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(obtenerNums() );
    }

}
