package exercise.ex_entrada_salida;

import exercise.Exercise;
import ui.IO;
import ui.Validation;
import java.util.ArrayList;

public class Exercise11 extends Exercise {

    String exerciseName = "Exercise 11";
    String description = "Realiza un conversor de Kb a Mb.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Input the amount of Kb: ");
    }

    public Exercise11(IO io) {
        super(io);
    }

    private double conversion(int kb) {
        return (double) kb / 1024;
    }
    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();

        int kb = io.toInt(inputs.get(0));
        io.write(String.format("%d Kb to Mb: %.2f", kb, conversion(kb)));
    }
}
