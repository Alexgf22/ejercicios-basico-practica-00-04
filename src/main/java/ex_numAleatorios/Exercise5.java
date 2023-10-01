package ex_numAleatorios;

import exercise.Exercise;
import ui.IO;
import java.util.Random;

public class Exercise5 extends Exercise {
    String exerciseName = "Exercise 5";
    String description = "Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.\n" +
            "Muestra también el máximo, el mínimo y la media de esos números.";
    public Exercise5(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int total = 0;
        int max = 0;
        int min = 0;
        double number = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            number = (Math.random()*100) + 100;
            total += number;
            if (number > max) {
                max = (int) number;
            }
            if (number < min) {
                min = (int) number;
            }
            result.append(number + " ");
        }
        result.append(String.format("The max number is %d, The minimum number is %d, adn their average is %d", max, min, (max + min) / 2));
    }
}
