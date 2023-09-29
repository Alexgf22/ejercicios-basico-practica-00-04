package ex_basicos;

import Exercise.*;
import ui.IO;
import ui.Validation;
import java.util.ArrayList;
import static java.lang.Math.round;

public class Exercise5 extends Exercise implements Inputs {
    String description = """
            Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir deberá
            estar almacenada en una variable.
            """;

    {
        question.add("Enter the quantity of pesetas you would like to convert: ");
    }

    public Exercise5(IO io) {
        super(io);
    }

    private double convert(int pesetas) {
        return round((pesetas * 0.00601012)*100.0)/100.0;
    }

    public void run() {
        displayDescription();
        int quantity = Validation.getInt(getInputs().get(0));
        io.write(String.format("%.2f pesetas converts to %.2f euros", quantity, convert(quantity)));
    }

    @Override
    public ArrayList<String> getInputs() {
        ArrayList inputs = new ArrayList();
        this.question.forEach(question -> {
            io.write(question);
            inputs.add(io.read());
        });
        return inputs;
    }
}


