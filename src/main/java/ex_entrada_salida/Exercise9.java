package ex_entrada_salida;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise9 extends Exercise {

    String exerciseName = "Exercise 9";
    String description = "Escribe un programa que calcule el volumen de un cono según la fórmula";
    {
        question.add("Introduce the radius of the cone");
        question.add("Introduce the height of the cone");
    }
    public Exercise9(IO io) {
        super(io);
    }

    private double volume(int radius, int height) {
        return (Math.PI * radius * radius * height) / 3;
    }

    @Override
    public void run() {
        ArrayList<String> inputs = this.getInputs();
        int radius = Validation.getInt(inputs.get(0));
        int height = Validation.getInt(inputs.get(1));

        io.write(String.format("The volume of the cone is %.2f", volume(radius, height)));
    }
}
