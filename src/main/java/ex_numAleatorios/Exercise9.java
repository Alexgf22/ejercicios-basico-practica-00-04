package ex_numAleatorios;

import exercise.Exercise;
import ui.IO;

public class Exercise9 extends Exercise {
    String exerciseName = "Exercise 9";
    String description = "Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine\n" +
            "de generar números hasta que no saque el 24. El programa deberá decir al final cuántos números\n" +
            "se han generado.";
    public Exercise9(IO io) {
        super(io);
    }

    @Override
    public void run() {
        int numero = 0;
        int count = 0;
        while (numero!= 24) {
            numero = (int) (Math.random() * 100);
            if (numero % 2 == 0) {
                System.out.println(numero);
                count++;
            }
        }
        io.write(String.format("%d even numbers were generted before 24 was called", count));
    }
}
