package ex_switch;

import exercise.Exercise;
import ui.IO;
import ui.Validation;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise13 extends Exercise {
    String exerciseName = "Exerecise 13";
    String description = "Escribe un programa que ordene tres números enteros introducidos por teclado.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce the first number");
        question.add("Introduce the second number");
        question.add("Introduce the third number");
    }
    public Exercise13(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();

        int num1 = Validation.getInt(inputs.get(0));
        int num2 = Validation.getInt(inputs.get(1));
        int num3 = Validation.getInt(inputs.get(2));

        io.write(String.format("The correct order of the numberes you introduced is %d", order(num1, num2, num3)));
    }

    private ArrayList<Integer> order(int num1, int num2, int num3) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        Collections.sort(numList);

        return numList;
    }
}
