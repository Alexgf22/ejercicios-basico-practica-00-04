package exercise.ex_numeros_aleatorios;

import exercise.Exercise;
import ui.IO;

public class Exercise1 extends Exercise {
    String exerciseName = "Exercise 1";
    String description = """
            Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total
            (los puntos que suman entre los tres dados).
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
    }
    public Exercise1(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int sum = dice1 + dice2 + dice3;

        io.write(String.format("Dice one rolled %d, dice two rolled %d, dice three rolled %d, the total was %d",
                dice1, dice2, dice3, sum));
    }

    private int rollDice(){
        return (int)(Math.random() * 6) + 1;
    }
}
