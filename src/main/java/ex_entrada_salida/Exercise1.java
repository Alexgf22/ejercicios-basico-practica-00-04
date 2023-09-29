package ex_entrada_salida;

import exercise.Exercise;
import ui.IO;
import ui.Validation;
import java.util.ArrayList;

public class Exercise1 extends Exercise {
    public Exercise1(IO io) {
        super(io);
    }

    //TODO Check this method of init blocks using sonarLint
    {
        question.add("Enter first number: ");
        question.add("Enter second number: ");
    }

    String exerciseName = "Exercise 1";
    String description = "Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.";

    public void run() {
            ArrayList<String> inputs = getInputs();

            int num1 = Validation.getInt(inputs.get(0));
            int num2 = Validation.getInt(inputs.get(1));

            io.write(String.format("The result of %d + %d = %d", num1, num2, num1 + num2));
    }
}
