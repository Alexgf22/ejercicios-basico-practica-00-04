package AlejandroGarcia.ParteAlejandroGarcia04;

import java.util.Random;

public class apuestasDeQuiniela {

    public static void main(String[] args) {
        Random random = new Random();

        String[] resultados = {"1", "X", "2"};

        int[] probabilidades = {3, 2, 1};

        // Presentamos los 14 partidos y el pleno al quince
        for (int i = 1; i <= 15; i++) {
            System.out.print("Partido " + i + ": ");

            for (int j = 0; j < 3; j++) {
                int indiceAleatorio = generarIndiceAleatorioConProbabilidades(random, probabilidades);
                String apuesta = resultados[indiceAleatorio];
                System.out.print(apuesta + " ");
            }

            // Nueva línea para el posterior partido
            System.out.println();
        }
    }

    public static int generarIndiceAleatorioConProbabilidades(Random random, int[] probabilidades) {
        int total = 0;
        for (int probabilidad : probabilidades) {
            total += probabilidad;
        }

        int valorAleatorio = random.nextInt(total) + 1;
        int sumaParcial = 0;

        for (int i = 0; i < probabilidades.length; i++) {
            sumaParcial += probabilidades[i];
            if (valorAleatorio <= sumaParcial) {
                return i;
            }
        }

        return probabilidades.length - 1;
    }

}
