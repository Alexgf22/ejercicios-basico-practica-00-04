package MauriDjango.exercise.ex_entrada_salida;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

public class Exercise9 extends Exercise {

    String exerciseName = "Exercise 9";
    String description = "Escribe un programa que calcule el volumen de un cono según la fórmula";

    {
        setExerciseName(exerciseName);
        setDescription(description);
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
        int radius = io.getInt();
        int height = io.getInt();

        io.write(String.format("The volume of the cone is %.2fcm3", volume(radius, height)));
    }
}
