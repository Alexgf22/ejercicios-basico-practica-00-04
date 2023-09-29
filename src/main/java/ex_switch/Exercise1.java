package ex_switch;

import exercise.Exercise;
import ui.IO;

import java.util.ArrayList;

public class Exercise1 extends Exercise {

    String exerciseName = "Exercise 1";
    String description = "Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a\n" +
            "primera hora ese día.";

    {
        question.add("Type the day of which you want to know the first class.");
    }


    public Exercise1(IO io) {
        super(io);
    }

    //TODO Check for complextity
    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        switch (inputs.get(0).toLowerCase()) {
            case "sunday", "saturday":
                io.write("The first class is no class.");
                break;
            case "monday", "friday":
                io.write("The first class is DWES.");
                break;
            case "tuesday":
                io.write("The first class is EIE.");
                break;
            case "wednesday", "thursday":
                io.write("The first class is DWEC.");
                break;
        }
    }
}
