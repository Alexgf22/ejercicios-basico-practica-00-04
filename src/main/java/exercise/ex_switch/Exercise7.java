package exercise.ex_switch;

import exercise.Exercise;
import ui.IO;
import ui.Validation;
import java.util.ArrayList;

public class Exercise7 extends Exercise {
    String exerciseName = "Exercise 7";
    String description = """
            Realiza un programa que calcule la media de tres notas. 35Sentencia condicional ( if y switch )
            """;
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Type the first mark");
        question.add("Type the second mark");
        question.add("Type the third mark");
    }
    public Exercise7(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();

        int num1 = io.toInt(inputs.get(0));
        int num2 = io.toInt(inputs.get(1));
        int num3 = io.toInt(inputs.get(2));

        io.write(String.format("The average mark is %d", getAverage(num1, num2, num3)));
    }

    public double getAverage(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }
}
