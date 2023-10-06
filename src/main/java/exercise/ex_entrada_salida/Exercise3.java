package exercise.ex_entrada_salida;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import static java.lang.Math.round;

public class Exercise3 extends Exercise {
    String exerciseName = "Exercise 3";
    String description = "Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser\n" +
            "introducida por teclado";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter quantity of pesetas");
    }

    public Exercise3(IO io) {
        super(io);
    }

    private double convert(int quantity) {
        return round((quantity * 0.00601012)*100.0)/100.0;
    }

    public void run() {
        int quantity = io.toInt(getInputs().get(0));
        io.write(String.format("%d pesetas converts to %.2f euros", quantity, convert(quantity)));
    }
}
