package ex_basicos;

import Exercise.*;
import java.util.Collections;
import ui.IO;

import java.util.List;

public class Exercise1 extends Exercise {
    private static final int X = 144;
    private static final int Y = 999;

    String exerciseName = "Exercise 1";
    String description = """
Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
999 respectivamente.
""";
    String question = """
            A continuación, muestra por pantalla el valor de cada variable, la suma, la
resta, la división y la multiplicación.
""";

    public Exercise1(IO io) {
        super(io);
    }

    private int add() {
        return Exercise1.X + Exercise1.Y;
    }

    private int minus() {
        return Exercise1.X - Exercise1.Y;
    }

    private int multiply(){
        return Exercise1.X * Exercise1.Y;
    }

    private double divide() {
        return (double) Exercise1.X / Exercise1.Y;
    }

    public void run() {
        io.write(String.format("""
                        The numbers added = %s
                        The numbers subtracted = %s
                        The numbers multiplied = %s
                        The numbers divided = %.2f"""
                , this.add(), this.minus(), this.multiply(), this.divide()));
    }
}
