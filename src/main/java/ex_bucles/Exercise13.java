package ex_bucles;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise13 extends Exercise {
    String exerciseName = "Exercise 13";
    String description = "Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuán-\n" +
            "tos son negativos.";
    {
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
        question.add("Introduce a number");
    }
    public Exercise13(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        AtomicInteger positives = new AtomicInteger();
        AtomicInteger negatives = new AtomicInteger();
        inputs.forEach(input -> {
            if (Validation.getInt(input) >= 0) {
                positives.addAndGet(1);
            } else {
                negatives.addAndGet(1);
            }
        });
    }
}
