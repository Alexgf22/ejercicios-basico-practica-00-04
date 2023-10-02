package ex_numeros_aleatorios;

import exercise.Exercise;
import ui.IO;
import java.util.ArrayList;

public class Exercise15 extends Exercise {
    String exerciseName = "Exercise 15";
    String description = """
            Realiza un generador de melodía con las siguientes condiciones:
            1. Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
            sol, la y si.
            1. Una melodía está formada por un número aleatorio de notas mayor o igual
            a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
            1. Cada grupo de 4 notas será un compás y estará separado del siguiente
            compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
            1. La última nota de la melodía debe coincidir con la primera.
            Ejemplo 1:
            do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
            Ejemplo 2:
            la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
                        
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }

    ArrayList<String> notes = new ArrayList<String>();
    {
        notes.add("do");
        notes.add("re");
        notes.add("mi");
        notes.add("fa");
        notes.add("sol");
        notes.add("la");
        notes.add("si");
    }

    public Exercise15(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int melodyLength = melodyLength();
        StringBuilder melody = new StringBuilder();

        for (int i = 0; i < melodyLength; i++) {
            if (i % 4 == 0) {
                melody.append("|");
            }
            melody.append(notePicker());
        }
        melody.append("||");
        io.write(melody.toString());
    }

    private String notePicker() {
        return notes.get((int) (Math.random() * notes.size()));
    }

    private int melodyLength() {
        int length = 1;
        while (length % 4 != 0) {
            length = (int) ((Math.random() * 25) + 4);
        }
        return length;
    }
}
