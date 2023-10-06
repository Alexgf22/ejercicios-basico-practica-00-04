package MauriDjango.exercise.ex_switch;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

public class Exercise3 extends Exercise {

    String exerciseName = "Exercise 3";
    String description = """
            Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día
            de la semana.
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Choose a number between 1 and 7 to see which day of the week it corresponds to.");
    }

    public Exercise3(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        switch (io.toInt(inputs.get(0))) {
            case 1:
                io.write("Sunday!");
                break;

            case 2:
                io.write("Monday!");
                break;

            case 3:
                io.write("Tuesday!");
                break;

            case 4:
                io.write("Wednesday!");
                break;

            case 5:
                io.write("Thursday!");
                break;

            case 6:
                io.write("Friday!");
                break;

            case 7:
                io.write("Saturday!");
                break;

            default:
                io.write("Invalid input!");
                break;
        }
    }
}

