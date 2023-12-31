package MauriDjango.exercise.ex_switch;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

//TODO should validate correct hours and minutes
public class Exercise11 extends Exercise {
    String exerciseName = "Exercise 11";
    String description = "Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que\n" +
            "faltan para llegar a la medianoche.";
    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("Type the current hour");
        question.add("Type the current minute");
    }
    public Exercise11(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();

        int hour = io.toInt(inputs.get(0));
        int minute = io.toInt(inputs.get(1));

        io.write(String.format("There are %d seconds left until midnight", getSecsToMidnight(hour, minute)));
    }

    private int getSecsToMidnight(int hour, int minute) {
        return (((24-hour)*60+(60-minute))*60);
    }
}
