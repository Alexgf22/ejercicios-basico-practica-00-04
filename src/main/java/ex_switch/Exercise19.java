package ex_switch;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise19 extends Exercise {
    String exerciseName = "Exercise 19";
    String description = "Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo\n" +
            "o negativo. Se permiten números de hasta 5 dígitos.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number to find its length.");
    }

    public Exercise19(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = Validation.getInt(inputs.get(0));

        io.write(String.format("The length of the number is %d", findIntLength(number)));
    }

    private int findIntLength(int number) {
        if (number < 0) {
            number = number * -1;
        }
        return Integer.toString(number).length();
    }
}
