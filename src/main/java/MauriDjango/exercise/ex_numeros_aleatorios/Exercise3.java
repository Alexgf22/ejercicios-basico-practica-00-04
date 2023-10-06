package MauriDjango.exercise.ex_numeros_aleatorios;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

import java.util.ArrayList;

public class Exercise3 extends Exercise {
    String exerciseName = "Exercise 3";
    String description = """
            Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
            está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por
            13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
            sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
                        
            Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3,
            4, 5, 6, 7, sota, caballo, rey y as.
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }
    ArrayList<String> cards = new ArrayList<String>();

    {
        cards.add("2");
        cards.add("3");
        cards.add("4");
        cards.add("5");
        cards.add("6");
        cards.add("7");
        cards.add("sota");
        cards.add("caballo");
        cards.add("rey");
        cards.add("as");
    }

    public Exercise3(IO io) {
        super(io);
    }
    @Override
    public void run() {
        io.write("The cards randomly selected is " + randomCard());
    }

    private String  randomCard() {
        return cards.get((int)(Math.random() * cards.size()));
    }
}
