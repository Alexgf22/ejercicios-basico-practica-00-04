package ex_bucles;

import exercise.Exercise;
import ui.IO;

public class Exercise5 extends Exercise {
    String exerciseName = "Exercise 5";
    String description = "Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while .";

    public Exercise5(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int num = 320;
        while (num >= 160) {
            io.write(Integer.toString(num));
            num = countByTwenty(num);
        }
    }

    private int countByTwenty(int num) {
        return num - 20;
    }
}
