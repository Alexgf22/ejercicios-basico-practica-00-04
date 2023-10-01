package ex_bucles;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise17 extends Exercise {
    String exerciseName = "Exercise 17";
    String description = """
            Realiza un programa que sume los 100 números siguientes a un número entero y positivo intro-
            ducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número
            positivo).
            """;
    {
        question.add("Enter a number");
    }
    public Exercise17(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = Validation.getInt(inputs.get(0));
        for (int i = 1; i <= 100; i++) {
            number += number + i;
        }
        io.write("The number summed with the 100 following numbers equals " + number);
    }
}
