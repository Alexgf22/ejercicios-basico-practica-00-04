package MauriDjango.exercise.ex_entrada_salida;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

public class Exercise13 extends Exercise {

    String exerciseName = "Exercise 13";
    String description = """
            Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
            Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer
            examen cuenta el 40% y la del segundo examen un 60
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce the marks of the first exam");
        question.add("What marks would do you want for the trimester?");
    }

    public Exercise13(IO io) {
        super(io);
    }

    //TODO Update to getDouble
    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int firstMark = io.toInt(inputs.get(0));
        int expectedMark = io.toInt(inputs.get(1));
        double grade = calculateGrade(firstMark, expectedMark);

        io.write(String.format("To get a mark of %d this trimester you need to score a %.1f on the second exam.", expectedMark, grade));
    }

    private double calculateGrade(int firstMark, int expectedMark) {

        return (expectedMark - (firstMark * .4)) / .6;
    }
}
