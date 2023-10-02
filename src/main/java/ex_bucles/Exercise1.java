package ex_bucles;

import exercise.Exercise;
import ui.IO;

public class Exercise1 extends Exercise {
    {
        setExerciseName("Exercise 1");
        setDescription("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.");
    }

   public Exercise1(IO io) {
        super(io);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                io.write(Integer.toString(timesFive(i)));
            }
        }
    }

    private int timesFive(int num) {
        return num * 5;
    }
}
