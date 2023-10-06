package exercise.ex_basicos;

import exercise.*;
import ui.IO;
import ui.Validation;

import static java.lang.Math.round;

public class Exercise5 extends Exercise {

    {
        setExerciseName("Exercise 5");
        setDescription("""
            Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir deberá
            estar almacenada en una variable.
            """);
        question.add("Enter the quantity of pesetas you would like to convert: ");
    }

    public Exercise5(IO io) {
        super(io);
    }

    private double convert(int pesetas) {
        return round((pesetas * 0.00601012)*100.0)/100.0;
    }

    public void run() {
        int quantity = io.toInt(getInputs().get(0));
        io.write(String.format("%d pesetas converts to %.2f euros", quantity, convert(quantity)));
    }
}


