package ex_entrada_salida;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

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

    private double calculateGrade(int firstMark, int expectedMark) {
            return (expectedMark - (firstMark * .4)) / .6;
    }

    //TODO Update to getDouble
    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int firstMark = Validation.getInt(inputs.get(0));
        int expectedMark = Validation.getInt(inputs.get(1));
        double grade = calculateGrade(firstMark, expectedMark);

        io.write(String.format("To get a mark of %d this trimester you need to score a %d on the second exam.", expectedMark, grade));
    }
}
