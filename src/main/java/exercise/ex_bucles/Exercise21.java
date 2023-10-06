package exercise.ex_bucles;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

public class Exercise21 extends Exercise {
    String exerciseName = "Exercise 21";
    String description = """
            Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
            nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El
            número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye
            en el cómputo.
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Enter a number");
    }

    public Exercise21(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int number = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        int oddCount = 0;

        while (number >= 0) {
            number = io.toInt(getInputs().get(0));
            if (number % 2 == 0) {
                if (number > even) {
                    even = number;
                }
            } else if (number >= 0){
                oddCount++;
                odd = odd + number;
            }
            count++;
        }
        io.write(String.format("There were %d numbers introduced, the largest even number was %d, and the average of the odd numbers was %d",
                count, even, odd / oddCount));
    }
}
