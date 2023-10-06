package MauriDjango.exercise.ex_bucles;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

public class Exercise17 extends Exercise {
    String exerciseName = "Exercise 17";
    String description = """
            Realiza un programa que sume los 100 números siguientes a un número entero y positivo intro-
            ducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número
            positivo).
            """;
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter a number");
    }
    public Exercise17(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result = result + (number + i);
        }
        io.write("The number summed with the 100 following numbers equals " + result);
    }
}
