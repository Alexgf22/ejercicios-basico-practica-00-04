package exercise.ex_switch;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise9 extends Exercise {
    String exerciseName = "Exercise 5";
    String description = "Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).";

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }

    public Exercise9(IO io) {
        super(io);
    }

    private Double equation(int a, int b) {
        return (double) b/(-a);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int a = io.toInt(inputs.get(0));
        int b = io.toInt(inputs.get(1));

        io.write(String.format("The solution for %dx + %d = 0 is %f", a, b, equation(a, b)));
    }
}