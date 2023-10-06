package MauriDjango.exercise.ex_entrada_salida;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;
import exercise.*;

import java.util.ArrayList;

public class Exercise7 extends Exercise {

    String exerciseName = "Exercise7";
    String description = "Escribe un programa que calcule el total de una factura a partir de la base imponible.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("How much was the bill?");
        question.add("How much is the tax?");
    }
    public Exercise7(IO io) {
        super(io);
    }

    public void run() {
        ArrayList<String> inputs = getInputs();
        int bill = io.toInt(inputs.get(0));
        int tax = io.toInt(inputs.get(1));

        io.write(String.format("The total of the bill %d plus the tax of %d percent is %.2f", bill, tax,calculatePrice(bill, tax)));
    }

    private double calculatePrice(int bill, int tax) {
        return (bill + (bill*((double) tax /100)));
    }
}
