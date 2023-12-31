package MauriDjango.exercise.ex_basicos;

import MauriDjango.exercise.Exercise;
import MauriDjango.ui.IO;

public class Exercise1 extends Exercise {
    private static final int X = 144;
    private static final int Y = 999;

    public Exercise1(IO io) {
        super(io);
        this.setExerciseName("Exercise 1");
        this.setDescription("""
Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
resta, la división y la multiplicación.""");
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

