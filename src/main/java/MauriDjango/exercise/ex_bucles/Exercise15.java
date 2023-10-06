package MauriDjango.exercise.ex_bucles;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

public class Exercise15 extends Exercise {
    String exerciseName = "Exercise 15";
    String description = """
            Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
            saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el expo-
            nente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos
            el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .46 Bucles
            """;
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter a base number");
        question.add("Enter an exponent");
    }
    public Exercise15(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int base = io.toInt(inputs.get(0));
        int exponent = io.toInt(inputs.get(1));

        for (int i = 1; i <= exponent; i++) {
            io.write(String.format("The base %d to the power of %d equals %s", base, i, Math.round(Math.pow(base, i))));
        }
    }
}
