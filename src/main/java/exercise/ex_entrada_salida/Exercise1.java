package exercise.ex_entrada_salida;

import exercise.Exercise;
import ui.IO;
import ui.Validation;
import java.util.ArrayList;

public class Exercise1 extends Exercise {
    public Exercise1(IO io) {
        super(io);
    }

    String exerciseName = "Exercise 1";
    String description = "Realiza un programa que pida dos números y que luego muestre el resultado de su multiplica";

    //TODO Check this method of init blocks using sonarLint
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter first number: ");
        question.add("Enter second number: ");
    }

    public void run() {
            ArrayList<String> inputs = getInputs();

            int num1 = io.toInt(inputs.get(0));
            int num2 = io.toInt(inputs.get(1));

            io.write(String.format("The result of %d + %d = %d", num1, num2, num1 + num2));
    }
}
