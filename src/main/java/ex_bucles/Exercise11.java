package ex_bucles;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise11 extends Exercise {
    String exerciseName = "Exerecise 11";
    String description = "Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros\n" +
            "números enteros a partir de uno que se introduce por teclado.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Introduce a number");
    }

    public Exercise11(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = Validation.getInt(inputs.get(0));

        for (int i = 0; i < 5; i++) {
            io.write("Number/Squared/Cubed");
            io.write(String.format("%d/%s/%s", number + i, Math.pow(number + i, 2), Math.pow(number + i, 3)));
        }
    }
}
