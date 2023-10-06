package exercise.ex_numeros_aleatorios;

import exercise.Exercise;
import ui.IO;

import java.util.ArrayList;

public class Exercise11 extends Exercise {
    String exerciseName = "Exercise 11";
    String description = "Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la\n" +
            "forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspen-\n" +
            "sos, el número de suficientes, el número de bienes, etc.";

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }
    ArrayList<String> notas = new ArrayList<String>();
    {
        notas.add("Suspenso");
        notas.add("Suficiente");
        notas.add("Bien");
        notas.add("Notable");
        notas.add("Sobresaliente");
    }
    ArrayList<Integer> occurences = new ArrayList<>();
    {
        occurences.add(0);
        occurences.add(0);
        occurences.add(0);
        occurences.add(0);
        occurences.add(0);
    }
    public Exercise11(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int index;
        for (int i = 0; i < 20; i++) {
            index = (int) Math.floor(Math.random() * notas.size());
            io.write(notas.get(index));
            occurences.set(index, occurences.get(index) + 1);
        }
        io.write(String.format("Suspensos = %d, Suficientes = %d, Bienes = %d, Notables = %d, Sobresaientes = %d",
                occurences.get(0), occurences.get(1), occurences.get(2), occurences.get(3), occurences.get(4)));
    }
}
