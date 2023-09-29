package ex_entrada_salida;

import exercise.*;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;

public class Exercise7 extends Exercise {

    String exerciseName = "Exercise7";
    String description = "Escribe un programa que calcule el total de una factura a partir de la base imponible.";

    {
        question.add("How much was the bill?");
        question.add("How much is the tax?");
    }
    public Exercise7(IO io) {
        super(io);
    }

    public void run() {
        ArrayList<String> inputs = getInputs();
        int bill = Validation.getInt(inputs.get(0));
        int tax = Validation.getInt(inputs.get(1))/100;

        io.write(String.format("The total of the bill %d plus the tax of %d percent is %.2f", bill, tax,((float) bill + bill*tax)));
    }
}
