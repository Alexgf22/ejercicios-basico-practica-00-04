package exercise.ex_switch;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise17 extends Exercise {

    String exerciseName = "Exercise17";
    String description = "Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number");
    }

    public Exercise17(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();

        int number = io.toInt(inputs.get(0));
        io.write("The last digit in the number you introduced is " + findLastNumber(number));
    }

    private int findLastNumber(int number) {
        return number % 10;
    }
}
