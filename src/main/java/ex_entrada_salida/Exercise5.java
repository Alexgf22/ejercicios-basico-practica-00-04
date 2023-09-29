package ex_entrada_salida;

import exercise.*;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise5 extends Exercise {

    String exerciseName = "Exercise 5";
    String description = "Escribe un programa que calcule el área de un rectángulo.";

    {
        question.add("Enter length");
        question.add("Enter width");
    }

    public Exercise5(IO io) {
        super(io);
    }

    public void run() {
        ArrayList<String> inputs = getInputs();
        int length = Validation.getInt(inputs.get(0));
        int width = Validation.getInt(inputs.get(1));

        io.write("The are of the space with length " + length + " and width " + width + " is: " + (length * width));
    }
}
